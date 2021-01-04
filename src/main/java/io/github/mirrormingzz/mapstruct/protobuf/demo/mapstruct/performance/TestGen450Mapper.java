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
public interface TestGen450Mapper {

TestGen450Mapper INSTANCE = Mappers.getMapper(TestGen450Mapper.class);

    User_451 map451(UserProtos.UserDTO userDTO);
    User_452 map452(UserProtos.UserDTO userDTO);
    User_453 map453(UserProtos.UserDTO userDTO);
    User_454 map454(UserProtos.UserDTO userDTO);
    User_455 map455(UserProtos.UserDTO userDTO);
    User_456 map456(UserProtos.UserDTO userDTO);
    User_457 map457(UserProtos.UserDTO userDTO);
    User_458 map458(UserProtos.UserDTO userDTO);
    User_459 map459(UserProtos.UserDTO userDTO);
    User_460 map460(UserProtos.UserDTO userDTO);
}

