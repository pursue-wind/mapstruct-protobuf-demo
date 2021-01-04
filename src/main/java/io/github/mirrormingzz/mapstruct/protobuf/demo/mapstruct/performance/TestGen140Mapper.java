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
public interface TestGen140Mapper {

TestGen140Mapper INSTANCE = Mappers.getMapper(TestGen140Mapper.class);

    User_141 map141(UserProtos.UserDTO userDTO);
    User_142 map142(UserProtos.UserDTO userDTO);
    User_143 map143(UserProtos.UserDTO userDTO);
    User_144 map144(UserProtos.UserDTO userDTO);
    User_145 map145(UserProtos.UserDTO userDTO);
    User_146 map146(UserProtos.UserDTO userDTO);
    User_147 map147(UserProtos.UserDTO userDTO);
    User_148 map148(UserProtos.UserDTO userDTO);
    User_149 map149(UserProtos.UserDTO userDTO);
    User_150 map150(UserProtos.UserDTO userDTO);
}

