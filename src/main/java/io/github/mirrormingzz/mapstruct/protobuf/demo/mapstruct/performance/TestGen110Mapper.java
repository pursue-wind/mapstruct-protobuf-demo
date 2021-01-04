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
public interface TestGen110Mapper {

TestGen110Mapper INSTANCE = Mappers.getMapper(TestGen110Mapper.class);

    User_111 map111(UserProtos.UserDTO userDTO);
    User_112 map112(UserProtos.UserDTO userDTO);
    User_113 map113(UserProtos.UserDTO userDTO);
    User_114 map114(UserProtos.UserDTO userDTO);
    User_115 map115(UserProtos.UserDTO userDTO);
    User_116 map116(UserProtos.UserDTO userDTO);
    User_117 map117(UserProtos.UserDTO userDTO);
    User_118 map118(UserProtos.UserDTO userDTO);
    User_119 map119(UserProtos.UserDTO userDTO);
    User_120 map120(UserProtos.UserDTO userDTO);
}

