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
public interface TestGen410Mapper {

TestGen410Mapper INSTANCE = Mappers.getMapper(TestGen410Mapper.class);

    User_411 map411(UserProtos.UserDTO userDTO);
    User_412 map412(UserProtos.UserDTO userDTO);
    User_413 map413(UserProtos.UserDTO userDTO);
    User_414 map414(UserProtos.UserDTO userDTO);
    User_415 map415(UserProtos.UserDTO userDTO);
    User_416 map416(UserProtos.UserDTO userDTO);
    User_417 map417(UserProtos.UserDTO userDTO);
    User_418 map418(UserProtos.UserDTO userDTO);
    User_419 map419(UserProtos.UserDTO userDTO);
    User_420 map420(UserProtos.UserDTO userDTO);
}

