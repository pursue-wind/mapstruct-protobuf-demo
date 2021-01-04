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
public interface TestGen80Mapper {

TestGen80Mapper INSTANCE = Mappers.getMapper(TestGen80Mapper.class);

    User_81 map81(UserProtos.UserDTO userDTO);
    User_82 map82(UserProtos.UserDTO userDTO);
    User_83 map83(UserProtos.UserDTO userDTO);
    User_84 map84(UserProtos.UserDTO userDTO);
    User_85 map85(UserProtos.UserDTO userDTO);
    User_86 map86(UserProtos.UserDTO userDTO);
    User_87 map87(UserProtos.UserDTO userDTO);
    User_88 map88(UserProtos.UserDTO userDTO);
    User_89 map89(UserProtos.UserDTO userDTO);
    User_90 map90(UserProtos.UserDTO userDTO);
}

