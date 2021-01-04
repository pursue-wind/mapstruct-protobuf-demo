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
public interface TestGen220Mapper {

TestGen220Mapper INSTANCE = Mappers.getMapper(TestGen220Mapper.class);

    User_221 map221(UserProtos.UserDTO userDTO);
    User_222 map222(UserProtos.UserDTO userDTO);
    User_223 map223(UserProtos.UserDTO userDTO);
    User_224 map224(UserProtos.UserDTO userDTO);
    User_225 map225(UserProtos.UserDTO userDTO);
    User_226 map226(UserProtos.UserDTO userDTO);
    User_227 map227(UserProtos.UserDTO userDTO);
    User_228 map228(UserProtos.UserDTO userDTO);
    User_229 map229(UserProtos.UserDTO userDTO);
    User_230 map230(UserProtos.UserDTO userDTO);
}

