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
public interface TestGen360Mapper {

TestGen360Mapper INSTANCE = Mappers.getMapper(TestGen360Mapper.class);

    User_361 map361(UserProtos.UserDTO userDTO);
    User_362 map362(UserProtos.UserDTO userDTO);
    User_363 map363(UserProtos.UserDTO userDTO);
    User_364 map364(UserProtos.UserDTO userDTO);
    User_365 map365(UserProtos.UserDTO userDTO);
    User_366 map366(UserProtos.UserDTO userDTO);
    User_367 map367(UserProtos.UserDTO userDTO);
    User_368 map368(UserProtos.UserDTO userDTO);
    User_369 map369(UserProtos.UserDTO userDTO);
    User_370 map370(UserProtos.UserDTO userDTO);
}

