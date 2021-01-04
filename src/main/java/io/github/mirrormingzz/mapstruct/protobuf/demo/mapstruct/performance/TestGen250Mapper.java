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
public interface TestGen250Mapper {

TestGen250Mapper INSTANCE = Mappers.getMapper(TestGen250Mapper.class);

    User_251 map251(UserProtos.UserDTO userDTO);
    User_252 map252(UserProtos.UserDTO userDTO);
    User_253 map253(UserProtos.UserDTO userDTO);
    User_254 map254(UserProtos.UserDTO userDTO);
    User_255 map255(UserProtos.UserDTO userDTO);
    User_256 map256(UserProtos.UserDTO userDTO);
    User_257 map257(UserProtos.UserDTO userDTO);
    User_258 map258(UserProtos.UserDTO userDTO);
    User_259 map259(UserProtos.UserDTO userDTO);
    User_260 map260(UserProtos.UserDTO userDTO);
}

