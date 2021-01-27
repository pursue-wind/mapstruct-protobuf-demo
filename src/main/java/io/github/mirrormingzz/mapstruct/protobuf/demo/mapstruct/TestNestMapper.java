package io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct;


import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.NestProtos;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.nest.Nest1;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface TestNestMapper {
    TestNestMapper INSTANCE = Mappers.getMapper(TestNestMapper.class);


    /** 嵌套转换 */
    NestProtos.Nest1 map(Nest1 nest1);

}
