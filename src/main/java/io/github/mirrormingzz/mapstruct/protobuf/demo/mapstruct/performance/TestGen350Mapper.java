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
public interface TestGen350Mapper {

TestGen350Mapper INSTANCE = Mappers.getMapper(TestGen350Mapper.class);

    User_351 map351(UserProtos.UserDTO userDTO);
    User_352 map352(UserProtos.UserDTO userDTO);
    User_353 map353(UserProtos.UserDTO userDTO);
    User_354 map354(UserProtos.UserDTO userDTO);
    User_355 map355(UserProtos.UserDTO userDTO);
    User_356 map356(UserProtos.UserDTO userDTO);
    User_357 map357(UserProtos.UserDTO userDTO);
    User_358 map358(UserProtos.UserDTO userDTO);
    User_359 map359(UserProtos.UserDTO userDTO);
    User_360 map360(UserProtos.UserDTO userDTO);
}

