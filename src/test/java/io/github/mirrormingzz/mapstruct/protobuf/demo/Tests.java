package io.github.mirrormingzz.mapstruct.protobuf.demo;

import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.TestProtos;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.complex.Test1;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.complex.Test2;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.complex.Test3;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.complex.Test4;
import io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct.TestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Tests {

    @Test
    public void test() {
        Test1 test1 = new Test1("1");
        Test2 test2 = new Test2("2");
        Test3 test3 = new Test3("3");
        TestProtos.Test map = TestMapper.INSTANCE.map(test1, test2, test3);
        System.out.println(map);
    }

    @Test
    public void test2() {
        Test3 test3 = new Test3("3");

        TestProtos.Test map = TestMapper.INSTANCE.map2(test3);
        System.out.println(map);
    }

    @Test
    public void test3() {
        Test4 test4 = new Test4(LocalDateTime.now());

        TestProtos.Test map = TestMapper.INSTANCE.map3(test4);
        System.out.println(map);
    }

    @Test
    public void test4() {
        Test3 test3 = new Test3("3");

        TestProtos.Test map = TestMapper.INSTANCE.map4(test3, t3 -> t3.getA4() + "自定义逻辑");
        System.out.println(map);
    }

    @Test
    public void test5() {
        Test3 test3 = new Test3("3");

        TestProtos.Test map = TestMapper.INSTANCE.map5(test3, 1, (lan, t3) -> t3.getA4() + "english");
        TestProtos.Test map2 = TestMapper.INSTANCE.map5(test3, 2, (lan, t3) -> t3.getA4() + "中文");
        System.out.println(map);
        System.out.println(map2);
    }

}
