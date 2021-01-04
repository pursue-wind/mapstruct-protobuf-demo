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
public interface TestGen320Mapper {

TestGen320Mapper INSTANCE = Mappers.getMapper(TestGen320Mapper.class);

    User_321 map321(UserProtos.UserDTO userDTO);
    User_322 map322(UserProtos.UserDTO userDTO);
    User_323 map323(UserProtos.UserDTO userDTO);
    User_324 map324(UserProtos.UserDTO userDTO);
    User_325 map325(UserProtos.UserDTO userDTO);
    User_326 map326(UserProtos.UserDTO userDTO);
    User_327 map327(UserProtos.UserDTO userDTO);
    User_328 map328(UserProtos.UserDTO userDTO);
    User_329 map329(UserProtos.UserDTO userDTO);
    User_330 map330(UserProtos.UserDTO userDTO);
}

