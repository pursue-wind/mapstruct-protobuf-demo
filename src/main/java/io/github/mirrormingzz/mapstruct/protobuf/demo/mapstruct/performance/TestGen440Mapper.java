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
public interface TestGen440Mapper {

TestGen440Mapper INSTANCE = Mappers.getMapper(TestGen440Mapper.class);

    User_441 map441(UserProtos.UserDTO userDTO);
    User_442 map442(UserProtos.UserDTO userDTO);
    User_443 map443(UserProtos.UserDTO userDTO);
    User_444 map444(UserProtos.UserDTO userDTO);
    User_445 map445(UserProtos.UserDTO userDTO);
    User_446 map446(UserProtos.UserDTO userDTO);
    User_447 map447(UserProtos.UserDTO userDTO);
    User_448 map448(UserProtos.UserDTO userDTO);
    User_449 map449(UserProtos.UserDTO userDTO);
    User_450 map450(UserProtos.UserDTO userDTO);
}

