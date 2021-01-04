package io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct.performance;

import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.UserProtos;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.performance.*;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
unmappedTargetPolicy = ReportingPolicy.IGNORE,
nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface TestGen120Mapper {

TestGen120Mapper INSTANCE = Mappers.getMapper(TestGen120Mapper.class);

    User_121 map121(UserProtos.UserDTO userDTO);
    User_122 map122(UserProtos.UserDTO userDTO);
    User_123 map123(UserProtos.UserDTO userDTO);
    User_124 map124(UserProtos.UserDTO userDTO);
    User_125 map125(UserProtos.UserDTO userDTO);
    User_126 map126(UserProtos.UserDTO userDTO);
    User_127 map127(UserProtos.UserDTO userDTO);
    User_128 map128(UserProtos.UserDTO userDTO);
    User_129 map129(UserProtos.UserDTO userDTO);
    User_130 map130(UserProtos.UserDTO userDTO);
}

