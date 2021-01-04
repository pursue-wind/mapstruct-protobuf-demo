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
public interface TestGen460Mapper {

TestGen460Mapper INSTANCE = Mappers.getMapper(TestGen460Mapper.class);

    User_461 map461(UserProtos.UserDTO userDTO);
    User_462 map462(UserProtos.UserDTO userDTO);
    User_463 map463(UserProtos.UserDTO userDTO);
    User_464 map464(UserProtos.UserDTO userDTO);
    User_465 map465(UserProtos.UserDTO userDTO);
    User_466 map466(UserProtos.UserDTO userDTO);
    User_467 map467(UserProtos.UserDTO userDTO);
    User_468 map468(UserProtos.UserDTO userDTO);
    User_469 map469(UserProtos.UserDTO userDTO);
    User_470 map470(UserProtos.UserDTO userDTO);
}

