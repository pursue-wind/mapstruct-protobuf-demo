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
public interface TestGen0Mapper {

TestGen0Mapper INSTANCE = Mappers.getMapper(TestGen0Mapper.class);

    User_1 map1(UserProtos.UserDTO userDTO);
    User_2 map2(UserProtos.UserDTO userDTO);
    User_3 map3(UserProtos.UserDTO userDTO);
    User_4 map4(UserProtos.UserDTO userDTO);
    User_5 map5(UserProtos.UserDTO userDTO);
    User_6 map6(UserProtos.UserDTO userDTO);
    User_7 map7(UserProtos.UserDTO userDTO);
    User_8 map8(UserProtos.UserDTO userDTO);
    User_9 map9(UserProtos.UserDTO userDTO);
    User_10 map10(UserProtos.UserDTO userDTO);
}

