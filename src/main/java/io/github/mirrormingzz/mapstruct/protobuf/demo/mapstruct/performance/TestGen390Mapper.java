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
public interface TestGen390Mapper {

TestGen390Mapper INSTANCE = Mappers.getMapper(TestGen390Mapper.class);

    User_391 map391(UserProtos.UserDTO userDTO);
    User_392 map392(UserProtos.UserDTO userDTO);
    User_393 map393(UserProtos.UserDTO userDTO);
    User_394 map394(UserProtos.UserDTO userDTO);
    User_395 map395(UserProtos.UserDTO userDTO);
    User_396 map396(UserProtos.UserDTO userDTO);
    User_397 map397(UserProtos.UserDTO userDTO);
    User_398 map398(UserProtos.UserDTO userDTO);
    User_399 map399(UserProtos.UserDTO userDTO);
    User_400 map400(UserProtos.UserDTO userDTO);
}

