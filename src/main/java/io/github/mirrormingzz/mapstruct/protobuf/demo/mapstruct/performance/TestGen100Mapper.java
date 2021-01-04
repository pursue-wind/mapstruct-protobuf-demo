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
public interface TestGen100Mapper {

TestGen100Mapper INSTANCE = Mappers.getMapper(TestGen100Mapper.class);

    User_101 map101(UserProtos.UserDTO userDTO);
    User_102 map102(UserProtos.UserDTO userDTO);
    User_103 map103(UserProtos.UserDTO userDTO);
    User_104 map104(UserProtos.UserDTO userDTO);
    User_105 map105(UserProtos.UserDTO userDTO);
    User_106 map106(UserProtos.UserDTO userDTO);
    User_107 map107(UserProtos.UserDTO userDTO);
    User_108 map108(UserProtos.UserDTO userDTO);
    User_109 map109(UserProtos.UserDTO userDTO);
    User_110 map110(UserProtos.UserDTO userDTO);
}

