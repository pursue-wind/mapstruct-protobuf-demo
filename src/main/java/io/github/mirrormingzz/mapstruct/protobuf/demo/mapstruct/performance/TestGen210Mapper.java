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
public interface TestGen210Mapper {

TestGen210Mapper INSTANCE = Mappers.getMapper(TestGen210Mapper.class);

    User_211 map211(UserProtos.UserDTO userDTO);
    User_212 map212(UserProtos.UserDTO userDTO);
    User_213 map213(UserProtos.UserDTO userDTO);
    User_214 map214(UserProtos.UserDTO userDTO);
    User_215 map215(UserProtos.UserDTO userDTO);
    User_216 map216(UserProtos.UserDTO userDTO);
    User_217 map217(UserProtos.UserDTO userDTO);
    User_218 map218(UserProtos.UserDTO userDTO);
    User_219 map219(UserProtos.UserDTO userDTO);
    User_220 map220(UserProtos.UserDTO userDTO);
}

