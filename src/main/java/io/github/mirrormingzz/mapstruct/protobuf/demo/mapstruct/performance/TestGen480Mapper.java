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
public interface TestGen480Mapper {

TestGen480Mapper INSTANCE = Mappers.getMapper(TestGen480Mapper.class);

    User_481 map481(UserProtos.UserDTO userDTO);
    User_482 map482(UserProtos.UserDTO userDTO);
    User_483 map483(UserProtos.UserDTO userDTO);
    User_484 map484(UserProtos.UserDTO userDTO);
    User_485 map485(UserProtos.UserDTO userDTO);
    User_486 map486(UserProtos.UserDTO userDTO);
    User_487 map487(UserProtos.UserDTO userDTO);
    User_488 map488(UserProtos.UserDTO userDTO);
    User_489 map489(UserProtos.UserDTO userDTO);
    User_490 map490(UserProtos.UserDTO userDTO);
}

