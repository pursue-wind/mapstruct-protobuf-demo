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
public interface TestGen180Mapper {

TestGen180Mapper INSTANCE = Mappers.getMapper(TestGen180Mapper.class);

    User_181 map181(UserProtos.UserDTO userDTO);
    User_182 map182(UserProtos.UserDTO userDTO);
    User_183 map183(UserProtos.UserDTO userDTO);
    User_184 map184(UserProtos.UserDTO userDTO);
    User_185 map185(UserProtos.UserDTO userDTO);
    User_186 map186(UserProtos.UserDTO userDTO);
    User_187 map187(UserProtos.UserDTO userDTO);
    User_188 map188(UserProtos.UserDTO userDTO);
    User_189 map189(UserProtos.UserDTO userDTO);
    User_190 map190(UserProtos.UserDTO userDTO);
}

