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
public interface TestGen400Mapper {

TestGen400Mapper INSTANCE = Mappers.getMapper(TestGen400Mapper.class);

    User_401 map401(UserProtos.UserDTO userDTO);
    User_402 map402(UserProtos.UserDTO userDTO);
    User_403 map403(UserProtos.UserDTO userDTO);
    User_404 map404(UserProtos.UserDTO userDTO);
    User_405 map405(UserProtos.UserDTO userDTO);
    User_406 map406(UserProtos.UserDTO userDTO);
    User_407 map407(UserProtos.UserDTO userDTO);
    User_408 map408(UserProtos.UserDTO userDTO);
    User_409 map409(UserProtos.UserDTO userDTO);
    User_410 map410(UserProtos.UserDTO userDTO);
}

