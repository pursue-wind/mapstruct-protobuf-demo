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
public interface TestGen230Mapper {

TestGen230Mapper INSTANCE = Mappers.getMapper(TestGen230Mapper.class);

    User_231 map231(UserProtos.UserDTO userDTO);
    User_232 map232(UserProtos.UserDTO userDTO);
    User_233 map233(UserProtos.UserDTO userDTO);
    User_234 map234(UserProtos.UserDTO userDTO);
    User_235 map235(UserProtos.UserDTO userDTO);
    User_236 map236(UserProtos.UserDTO userDTO);
    User_237 map237(UserProtos.UserDTO userDTO);
    User_238 map238(UserProtos.UserDTO userDTO);
    User_239 map239(UserProtos.UserDTO userDTO);
    User_240 map240(UserProtos.UserDTO userDTO);
}

