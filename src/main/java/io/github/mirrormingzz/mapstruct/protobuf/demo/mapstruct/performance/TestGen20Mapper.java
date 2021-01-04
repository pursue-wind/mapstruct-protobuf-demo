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
public interface TestGen20Mapper {

TestGen20Mapper INSTANCE = Mappers.getMapper(TestGen20Mapper.class);

    User_21 map21(UserProtos.UserDTO userDTO);
    User_22 map22(UserProtos.UserDTO userDTO);
    User_23 map23(UserProtos.UserDTO userDTO);
    User_24 map24(UserProtos.UserDTO userDTO);
    User_25 map25(UserProtos.UserDTO userDTO);
    User_26 map26(UserProtos.UserDTO userDTO);
    User_27 map27(UserProtos.UserDTO userDTO);
    User_28 map28(UserProtos.UserDTO userDTO);
    User_29 map29(UserProtos.UserDTO userDTO);
    User_30 map30(UserProtos.UserDTO userDTO);
}

