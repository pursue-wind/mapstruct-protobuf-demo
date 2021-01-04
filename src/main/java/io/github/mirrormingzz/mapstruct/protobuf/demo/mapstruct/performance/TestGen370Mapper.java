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
public interface TestGen370Mapper {

TestGen370Mapper INSTANCE = Mappers.getMapper(TestGen370Mapper.class);

    User_371 map371(UserProtos.UserDTO userDTO);
    User_372 map372(UserProtos.UserDTO userDTO);
    User_373 map373(UserProtos.UserDTO userDTO);
    User_374 map374(UserProtos.UserDTO userDTO);
    User_375 map375(UserProtos.UserDTO userDTO);
    User_376 map376(UserProtos.UserDTO userDTO);
    User_377 map377(UserProtos.UserDTO userDTO);
    User_378 map378(UserProtos.UserDTO userDTO);
    User_379 map379(UserProtos.UserDTO userDTO);
    User_380 map380(UserProtos.UserDTO userDTO);
}

