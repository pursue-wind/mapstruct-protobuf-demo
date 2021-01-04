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
public interface TestGen300Mapper {

TestGen300Mapper INSTANCE = Mappers.getMapper(TestGen300Mapper.class);

    User_301 map301(UserProtos.UserDTO userDTO);
    User_302 map302(UserProtos.UserDTO userDTO);
    User_303 map303(UserProtos.UserDTO userDTO);
    User_304 map304(UserProtos.UserDTO userDTO);
    User_305 map305(UserProtos.UserDTO userDTO);
    User_306 map306(UserProtos.UserDTO userDTO);
    User_307 map307(UserProtos.UserDTO userDTO);
    User_308 map308(UserProtos.UserDTO userDTO);
    User_309 map309(UserProtos.UserDTO userDTO);
    User_310 map310(UserProtos.UserDTO userDTO);
}

