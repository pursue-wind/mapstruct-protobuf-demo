package io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct;


import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.TestProtos;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.complex.Test1;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.complex.Test2;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.complex.Test3;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.complex.Test4;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.function.Function;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
public interface TestMapper {
    TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);


    @Mapping(source = "test3.a4", target = "a3")
    TestProtos.Test map(Test1 test1, Test2 test2, Test3 test3);

    @Mapping(source = "test3.a4", target = "a3")
    TestProtos.Test map2(Test3 test3);

    @Mapping(target = "a3", expression = "java(test4.getDateTime().format(java.time.format.DateTimeFormatter.ISO_DATE_TIME))")
    TestProtos.Test map3(Test4 test4);


    @Mappings({
            @Mapping(source = "test3.a4", target = "a3"),
            @Mapping(target = "a2", expression = "java(function.apply(test3))")
    })
    TestProtos.Test map4(Test3 test3, Function<Test3, String> function);


    @Mappings({
            @Mapping(source = "test3.a4", target = "a3"),
            @Mapping(target = "a2", expression = "java(language.handler(lan, test3))")
    })
    TestProtos.Test map5(Test3 test3, Integer lan, Language<Test3> language);
}
