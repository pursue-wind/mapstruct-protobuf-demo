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
public interface TestGen380Mapper {

TestGen380Mapper INSTANCE = Mappers.getMapper(TestGen380Mapper.class);

    User_381 map381(UserProtos.UserDTO userDTO);
    User_382 map382(UserProtos.UserDTO userDTO);
    User_383 map383(UserProtos.UserDTO userDTO);
    User_384 map384(UserProtos.UserDTO userDTO);
    User_385 map385(UserProtos.UserDTO userDTO);
    User_386 map386(UserProtos.UserDTO userDTO);
    User_387 map387(UserProtos.UserDTO userDTO);
    User_388 map388(UserProtos.UserDTO userDTO);
    User_389 map389(UserProtos.UserDTO userDTO);
    User_390 map390(UserProtos.UserDTO userDTO);
}

