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
public interface TestGen340Mapper {

TestGen340Mapper INSTANCE = Mappers.getMapper(TestGen340Mapper.class);

    User_341 map341(UserProtos.UserDTO userDTO);
    User_342 map342(UserProtos.UserDTO userDTO);
    User_343 map343(UserProtos.UserDTO userDTO);
    User_344 map344(UserProtos.UserDTO userDTO);
    User_345 map345(UserProtos.UserDTO userDTO);
    User_346 map346(UserProtos.UserDTO userDTO);
    User_347 map347(UserProtos.UserDTO userDTO);
    User_348 map348(UserProtos.UserDTO userDTO);
    User_349 map349(UserProtos.UserDTO userDTO);
    User_350 map350(UserProtos.UserDTO userDTO);
}

