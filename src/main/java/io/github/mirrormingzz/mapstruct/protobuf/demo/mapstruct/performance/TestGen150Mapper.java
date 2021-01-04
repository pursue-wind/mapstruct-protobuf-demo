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
public interface TestGen150Mapper {

TestGen150Mapper INSTANCE = Mappers.getMapper(TestGen150Mapper.class);

    User_151 map151(UserProtos.UserDTO userDTO);
    User_152 map152(UserProtos.UserDTO userDTO);
    User_153 map153(UserProtos.UserDTO userDTO);
    User_154 map154(UserProtos.UserDTO userDTO);
    User_155 map155(UserProtos.UserDTO userDTO);
    User_156 map156(UserProtos.UserDTO userDTO);
    User_157 map157(UserProtos.UserDTO userDTO);
    User_158 map158(UserProtos.UserDTO userDTO);
    User_159 map159(UserProtos.UserDTO userDTO);
    User_160 map160(UserProtos.UserDTO userDTO);
}

