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
public interface TestGen430Mapper {

TestGen430Mapper INSTANCE = Mappers.getMapper(TestGen430Mapper.class);

    User_431 map431(UserProtos.UserDTO userDTO);
    User_432 map432(UserProtos.UserDTO userDTO);
    User_433 map433(UserProtos.UserDTO userDTO);
    User_434 map434(UserProtos.UserDTO userDTO);
    User_435 map435(UserProtos.UserDTO userDTO);
    User_436 map436(UserProtos.UserDTO userDTO);
    User_437 map437(UserProtos.UserDTO userDTO);
    User_438 map438(UserProtos.UserDTO userDTO);
    User_439 map439(UserProtos.UserDTO userDTO);
    User_440 map440(UserProtos.UserDTO userDTO);
}

