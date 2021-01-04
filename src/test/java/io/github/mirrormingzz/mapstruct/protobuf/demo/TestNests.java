package io.github.mirrormingzz.mapstruct.protobuf.demo;

import com.google.protobuf.Any;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.BaseProtos;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.NestProtos;
import io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct.TestNestMapper;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.nest.Nest1;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.nest.Nest2;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.nest.Nest3;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Base64;
import java.util.LinkedList;
import java.util.List;


@SpringBootTest
class TestNests {

    @Test
    public void test() {
        Nest3 nest3 = new Nest3("3");
        Nest2 nest21 = new Nest2("21", nest3);
        Nest2 nest22 = new Nest2("22", nest3);

        List<Nest2> list = new LinkedList<>();
        list.add(nest21);
        list.add(nest22);
        Nest1 nest1 = new Nest1("1", list);

        NestProtos.Nest1 map = TestNestMapper.INSTANCE.map(nest1);
        System.out.println(map);
    }

    @Test
    public void test2() {
        Nest3 nest3 = new Nest3("3");
        Nest2 nest21 = new Nest2("21", nest3);
        Nest2 nest22 = new Nest2("22", nest3);

        List<Nest2> list = new LinkedList<>();
        list.add(nest21);
        list.add(nest22);
        Nest1 nest1 = new Nest1("1", list);

        NestProtos.Nest1 map = TestNestMapper.INSTANCE.map(nest1);

        Any pack = Any.pack(map);
        BaseProtos.TestAny build = BaseProtos.TestAny.newBuilder().addDetails(pack).build();
        System.out.println(build);
    }
}
