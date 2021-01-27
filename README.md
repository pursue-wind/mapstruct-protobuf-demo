# 使用Mapstruct进行JavaBean，Protobuf互相转换

> [Mapstruct官网](https://mapstruct.org/)

## IDEA 插件（Plugins搜索MapStruct support）：

https://plugins.jetbrains.com/plugin/10036-mapstruct-support

## Maven 下使用：

https://github.com/pursue-wind/mapstruct-protobuf-demo/

## Gradle下使用：

https://github.com/pursue-wind/mapstruct-protobuf-demo/tree/gradle

## Gradle下性能表现(受Lombok编译性能影响较大)：

https://github.com/pursue-wind/mapstruct-protobuf-demo/tree/gradle_performance


## 使用(test包下的相关Test类)
> 以下省略Java对象的lombok注解

- 接口传入的对象和返回的对象字段名字匹配且类型匹配时，在编译时自动生成对应的转换方法
- 生成的转换实现类在target包（maven项目）下接口同级目录
- 转换写法有误会导致编译无法通过，请根据提示修改

### @Mapper注解

```
@Mapper(/* 用于 Spring 注入 */
        componentModel = "spring",
        /* PB <-> JavaBean 模式下使用该策略 */
        collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        /* 未映射目标属性的报告策略 */
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        /* 确定何时对bean映射的源属性值包含空检查 */
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
```

### 多个Java对象转PB

#### Java 对象

> Test3 字段名字为a4

```java
public class Test1 { String a1; }
public class Test2 { String a2; }
public class Test3 { String a4; }
```

#### PB 对象

```
message Test {
  string a1 = 1;
  string a2 = 2;
  string a3 = 3;
}
```
#### 转换Mapper
```java
// 当字段不同时，添加注解映射  Test3的a4字段 对应 TestProtos.Test的a3字段
@Mapping(source = "test3.a4", target = "a3")
TestProtos.Test map(Test1 test1, Test2 test2, Test3 test3);
```



### 嵌套对象转换

#### Java对象

```java
public class Nest1 {
    private String a1;
    private List<Nest2> nest2;
}
public class Nest2 {
    private String a2;
    private Nest3 nest3;
}
public class Nest3 {
    private String a3;
}
```

#### PB对象

```java
message Nest1 {
  string a1 = 1;
  repeated Nest2 nest2 = 2;
}
message Nest2{
  string a2 = 1;
  Nest3 nest3 = 2;
}
message Nest3{
  string a3 = 1;
}
```

#### 转换Mapper

```java
NestProtos.Nest1 map(Nest1 nest1);
```

### 基于表达式的转换

#### Java对象

```java
public class Test4 {
    LocalDateTime dateTime;
}
```

#### PB对象

```java
message Test {
  string a1 = 1;
  string a2 = 2;
  string a3 = 3;
}
```

#### 转换Mapper

```java
// 将 Java对象 Test4 的 LocalDateTime 字段转换为String后映射到 PB对象 Test 的 a3 字段
@Mapping(target = "a3", expression = "java(test4.getDateTime().format(java.time.format.DateTimeFormatter.ISO_DATE_TIME))")
TestProtos.Test map3(Test4 test4);
```
###  使用接口作为参数进行转换

#### Java对象

```java
public class Test3 {
    String a4;
}
```

#### PB对象

```java
message Test {
  string a1 = 1;
  string a2 = 2;
  string a3 = 3;
}
```

#### 转换Mapper

```java
@Mappings({
    	// Java对象 Test3 的 a4 字段 映射到PB对象 TestProtos.Test 的 a3 字段
        @Mapping(source = "test3.a4", target = "a3"),
    	// Function 接收一个 Test3 对象, 函数的返回值映射到PB对象 TestProtos.Test 的 a2 字段
        @Mapping(target = "a2", expression = "java(function.apply(test3))")
})
TestProtos.Test map4(Test3 test3, Function<Test3, String> function);
```

###  使用接口作为参数进行转换2

#### Java对象

```java
public class Test3 {
    String a4;
}
```

#### PB对象

```java
message Test {
  string a1 = 1;
  string a2 = 2;
  string a3 = 3;
}
```

#### 自定义接口(接收两个参数返回一个参数)

```java
@FunctionalInterface
public interface Language<T> {
    String handler(Integer lan, T t);
}
```

#### 转换Mapper

```java
@Mappings({
		// Java对象 Test3 的 a4 字段 映射到PB对象 TestProtos.Test 的 a3 字段
        @Mapping(source = "test3.a4", target = "a3"),
    	// Java对象 Test3 的 a4 字段 映射到PB对象 TestProtos.Test 的 a2 字段
        @Mapping(target = "a2", expression = "java(language.handler(lan, test3))")
})
TestProtos.Test map5(Test3 test3, Integer lan, Language<Test3> language);
```

