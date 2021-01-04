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
public interface TestGen470Mapper {

TestGen470Mapper INSTANCE = Mappers.getMapper(TestGen470Mapper.class);

    User_471 map471(UserProtos.UserDTO userDTO);
    User_472 map472(UserProtos.UserDTO userDTO);
    User_473 map473(UserProtos.UserDTO userDTO);
    User_474 map474(UserProtos.UserDTO userDTO);
    User_475 map475(UserProtos.UserDTO userDTO);
    User_476 map476(UserProtos.UserDTO userDTO);
    User_477 map477(UserProtos.UserDTO userDTO);
    User_478 map478(UserProtos.UserDTO userDTO);
    User_479 map479(UserProtos.UserDTO userDTO);
    User_480 map480(UserProtos.UserDTO userDTO);
}

