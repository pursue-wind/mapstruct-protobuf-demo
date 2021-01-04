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
public interface TestGen60Mapper {

TestGen60Mapper INSTANCE = Mappers.getMapper(TestGen60Mapper.class);

    User_61 map61(UserProtos.UserDTO userDTO);
    User_62 map62(UserProtos.UserDTO userDTO);
    User_63 map63(UserProtos.UserDTO userDTO);
    User_64 map64(UserProtos.UserDTO userDTO);
    User_65 map65(UserProtos.UserDTO userDTO);
    User_66 map66(UserProtos.UserDTO userDTO);
    User_67 map67(UserProtos.UserDTO userDTO);
    User_68 map68(UserProtos.UserDTO userDTO);
    User_69 map69(UserProtos.UserDTO userDTO);
    User_70 map70(UserProtos.UserDTO userDTO);
}

