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
public interface TestGen420Mapper {

TestGen420Mapper INSTANCE = Mappers.getMapper(TestGen420Mapper.class);

    User_421 map421(UserProtos.UserDTO userDTO);
    User_422 map422(UserProtos.UserDTO userDTO);
    User_423 map423(UserProtos.UserDTO userDTO);
    User_424 map424(UserProtos.UserDTO userDTO);
    User_425 map425(UserProtos.UserDTO userDTO);
    User_426 map426(UserProtos.UserDTO userDTO);
    User_427 map427(UserProtos.UserDTO userDTO);
    User_428 map428(UserProtos.UserDTO userDTO);
    User_429 map429(UserProtos.UserDTO userDTO);
    User_430 map430(UserProtos.UserDTO userDTO);
}

