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
public interface TestGen50Mapper {

TestGen50Mapper INSTANCE = Mappers.getMapper(TestGen50Mapper.class);

    User_51 map51(UserProtos.UserDTO userDTO);
    User_52 map52(UserProtos.UserDTO userDTO);
    User_53 map53(UserProtos.UserDTO userDTO);
    User_54 map54(UserProtos.UserDTO userDTO);
    User_55 map55(UserProtos.UserDTO userDTO);
    User_56 map56(UserProtos.UserDTO userDTO);
    User_57 map57(UserProtos.UserDTO userDTO);
    User_58 map58(UserProtos.UserDTO userDTO);
    User_59 map59(UserProtos.UserDTO userDTO);
    User_60 map60(UserProtos.UserDTO userDTO);
}

