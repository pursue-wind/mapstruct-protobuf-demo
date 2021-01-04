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
public interface TestGen330Mapper {

TestGen330Mapper INSTANCE = Mappers.getMapper(TestGen330Mapper.class);

    User_331 map331(UserProtos.UserDTO userDTO);
    User_332 map332(UserProtos.UserDTO userDTO);
    User_333 map333(UserProtos.UserDTO userDTO);
    User_334 map334(UserProtos.UserDTO userDTO);
    User_335 map335(UserProtos.UserDTO userDTO);
    User_336 map336(UserProtos.UserDTO userDTO);
    User_337 map337(UserProtos.UserDTO userDTO);
    User_338 map338(UserProtos.UserDTO userDTO);
    User_339 map339(UserProtos.UserDTO userDTO);
    User_340 map340(UserProtos.UserDTO userDTO);
}

