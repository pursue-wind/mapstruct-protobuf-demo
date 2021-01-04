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
public interface TestGen240Mapper {

TestGen240Mapper INSTANCE = Mappers.getMapper(TestGen240Mapper.class);

    User_241 map241(UserProtos.UserDTO userDTO);
    User_242 map242(UserProtos.UserDTO userDTO);
    User_243 map243(UserProtos.UserDTO userDTO);
    User_244 map244(UserProtos.UserDTO userDTO);
    User_245 map245(UserProtos.UserDTO userDTO);
    User_246 map246(UserProtos.UserDTO userDTO);
    User_247 map247(UserProtos.UserDTO userDTO);
    User_248 map248(UserProtos.UserDTO userDTO);
    User_249 map249(UserProtos.UserDTO userDTO);
    User_250 map250(UserProtos.UserDTO userDTO);
}

