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
public interface TestGen130Mapper {

TestGen130Mapper INSTANCE = Mappers.getMapper(TestGen130Mapper.class);

    User_131 map131(UserProtos.UserDTO userDTO);
    User_132 map132(UserProtos.UserDTO userDTO);
    User_133 map133(UserProtos.UserDTO userDTO);
    User_134 map134(UserProtos.UserDTO userDTO);
    User_135 map135(UserProtos.UserDTO userDTO);
    User_136 map136(UserProtos.UserDTO userDTO);
    User_137 map137(UserProtos.UserDTO userDTO);
    User_138 map138(UserProtos.UserDTO userDTO);
    User_139 map139(UserProtos.UserDTO userDTO);
    User_140 map140(UserProtos.UserDTO userDTO);
}

