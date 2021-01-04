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
public interface TestGen170Mapper {

TestGen170Mapper INSTANCE = Mappers.getMapper(TestGen170Mapper.class);

    User_171 map171(UserProtos.UserDTO userDTO);
    User_172 map172(UserProtos.UserDTO userDTO);
    User_173 map173(UserProtos.UserDTO userDTO);
    User_174 map174(UserProtos.UserDTO userDTO);
    User_175 map175(UserProtos.UserDTO userDTO);
    User_176 map176(UserProtos.UserDTO userDTO);
    User_177 map177(UserProtos.UserDTO userDTO);
    User_178 map178(UserProtos.UserDTO userDTO);
    User_179 map179(UserProtos.UserDTO userDTO);
    User_180 map180(UserProtos.UserDTO userDTO);
}

