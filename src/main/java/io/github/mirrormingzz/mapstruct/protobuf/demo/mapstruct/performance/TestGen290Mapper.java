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
public interface TestGen290Mapper {

TestGen290Mapper INSTANCE = Mappers.getMapper(TestGen290Mapper.class);

    User_291 map291(UserProtos.UserDTO userDTO);
    User_292 map292(UserProtos.UserDTO userDTO);
    User_293 map293(UserProtos.UserDTO userDTO);
    User_294 map294(UserProtos.UserDTO userDTO);
    User_295 map295(UserProtos.UserDTO userDTO);
    User_296 map296(UserProtos.UserDTO userDTO);
    User_297 map297(UserProtos.UserDTO userDTO);
    User_298 map298(UserProtos.UserDTO userDTO);
    User_299 map299(UserProtos.UserDTO userDTO);
    User_300 map300(UserProtos.UserDTO userDTO);
}

