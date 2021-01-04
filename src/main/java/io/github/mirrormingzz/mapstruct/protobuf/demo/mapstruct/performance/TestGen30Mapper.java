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
public interface TestGen30Mapper {

TestGen30Mapper INSTANCE = Mappers.getMapper(TestGen30Mapper.class);

    User_31 map31(UserProtos.UserDTO userDTO);
    User_32 map32(UserProtos.UserDTO userDTO);
    User_33 map33(UserProtos.UserDTO userDTO);
    User_34 map34(UserProtos.UserDTO userDTO);
    User_35 map35(UserProtos.UserDTO userDTO);
    User_36 map36(UserProtos.UserDTO userDTO);
    User_37 map37(UserProtos.UserDTO userDTO);
    User_38 map38(UserProtos.UserDTO userDTO);
    User_39 map39(UserProtos.UserDTO userDTO);
    User_40 map40(UserProtos.UserDTO userDTO);
}

