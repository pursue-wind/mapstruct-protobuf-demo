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
public interface TestGen10Mapper {

TestGen10Mapper INSTANCE = Mappers.getMapper(TestGen10Mapper.class);

    User_11 map11(UserProtos.UserDTO userDTO);
    User_12 map12(UserProtos.UserDTO userDTO);
    User_13 map13(UserProtos.UserDTO userDTO);
    User_14 map14(UserProtos.UserDTO userDTO);
    User_15 map15(UserProtos.UserDTO userDTO);
    User_16 map16(UserProtos.UserDTO userDTO);
    User_17 map17(UserProtos.UserDTO userDTO);
    User_18 map18(UserProtos.UserDTO userDTO);
    User_19 map19(UserProtos.UserDTO userDTO);
    User_20 map20(UserProtos.UserDTO userDTO);
}

