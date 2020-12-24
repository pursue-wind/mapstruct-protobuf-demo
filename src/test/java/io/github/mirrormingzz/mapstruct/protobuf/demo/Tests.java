package io.github.mirrormingzz.mapstruct.protobuf.demo;

import com.google.protobuf.InvalidProtocolBufferException;
import io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct.TestMapper;
import io.github.mirrormingzz.mapstruct.protobuf.demo.test.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class Tests {

    @Test
    public void test() throws InvalidProtocolBufferException {
        Test1 test1 = new Test1("1");
        Test2 test2 = new Test2("2");
        Test3 test3 = new Test3("3");

        TestProtos.Test map = TestMapper.INSTANCE.map(test1, test2, test3);
        System.out.println(map);
        System.out.println(map);
    }

    @Test
    public void test2() throws InvalidProtocolBufferException {
        Test3 test3 = new Test3("3");

        TestProtos.Test map = TestMapper.INSTANCE.map2(test3);
        System.out.println(map);
    }

    @Test
    public void test3() throws InvalidProtocolBufferException {
        Test4 test4 = new Test4(LocalDateTime.now());

        TestProtos.Test map = TestMapper.INSTANCE.map3(test4);
        System.out.println(map);
    }

    @Test
    public void test4() throws InvalidProtocolBufferException {
        Test3 test3 = new Test3("3");

        TestProtos.Test map = TestMapper.INSTANCE.map4(test3, t3 -> t3.getA4() + "自定义逻辑");
        System.out.println(map);
    }

}
