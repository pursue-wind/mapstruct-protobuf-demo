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
public interface TestGen70Mapper {

TestGen70Mapper INSTANCE = Mappers.getMapper(TestGen70Mapper.class);

    User_71 map71(UserProtos.UserDTO userDTO);
    User_72 map72(UserProtos.UserDTO userDTO);
    User_73 map73(UserProtos.UserDTO userDTO);
    User_74 map74(UserProtos.UserDTO userDTO);
    User_75 map75(UserProtos.UserDTO userDTO);
    User_76 map76(UserProtos.UserDTO userDTO);
    User_77 map77(UserProtos.UserDTO userDTO);
    User_78 map78(UserProtos.UserDTO userDTO);
    User_79 map79(UserProtos.UserDTO userDTO);
    User_80 map80(UserProtos.UserDTO userDTO);
}

