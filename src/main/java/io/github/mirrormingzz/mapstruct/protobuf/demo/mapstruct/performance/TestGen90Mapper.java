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
public interface TestGen90Mapper {

TestGen90Mapper INSTANCE = Mappers.getMapper(TestGen90Mapper.class);

    User_91 map91(UserProtos.UserDTO userDTO);
    User_92 map92(UserProtos.UserDTO userDTO);
    User_93 map93(UserProtos.UserDTO userDTO);
    User_94 map94(UserProtos.UserDTO userDTO);
    User_95 map95(UserProtos.UserDTO userDTO);
    User_96 map96(UserProtos.UserDTO userDTO);
    User_97 map97(UserProtos.UserDTO userDTO);
    User_98 map98(UserProtos.UserDTO userDTO);
    User_99 map99(UserProtos.UserDTO userDTO);
    User_100 map100(UserProtos.UserDTO userDTO);
}

