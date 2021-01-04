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
public interface TestGen190Mapper {

TestGen190Mapper INSTANCE = Mappers.getMapper(TestGen190Mapper.class);

    User_191 map191(UserProtos.UserDTO userDTO);
    User_192 map192(UserProtos.UserDTO userDTO);
    User_193 map193(UserProtos.UserDTO userDTO);
    User_194 map194(UserProtos.UserDTO userDTO);
    User_195 map195(UserProtos.UserDTO userDTO);
    User_196 map196(UserProtos.UserDTO userDTO);
    User_197 map197(UserProtos.UserDTO userDTO);
    User_198 map198(UserProtos.UserDTO userDTO);
    User_199 map199(UserProtos.UserDTO userDTO);
    User_200 map200(UserProtos.UserDTO userDTO);
}

