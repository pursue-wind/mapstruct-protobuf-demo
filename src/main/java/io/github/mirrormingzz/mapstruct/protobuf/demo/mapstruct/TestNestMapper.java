package io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct;


import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.NestProtos;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.nest.Nest1;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface TestNestMapper {
    TestNestMapper INSTANCE = Mappers.getMapper(TestNestMapper.class);


    NestProtos.Nest1 map(Nest1 nest1);

}
