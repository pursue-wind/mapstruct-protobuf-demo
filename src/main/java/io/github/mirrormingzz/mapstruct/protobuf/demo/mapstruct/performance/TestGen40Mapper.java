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
public interface TestGen40Mapper {

TestGen40Mapper INSTANCE = Mappers.getMapper(TestGen40Mapper.class);

    User_41 map41(UserProtos.UserDTO userDTO);
    User_42 map42(UserProtos.UserDTO userDTO);
    User_43 map43(UserProtos.UserDTO userDTO);
    User_44 map44(UserProtos.UserDTO userDTO);
    User_45 map45(UserProtos.UserDTO userDTO);
    User_46 map46(UserProtos.UserDTO userDTO);
    User_47 map47(UserProtos.UserDTO userDTO);
    User_48 map48(UserProtos.UserDTO userDTO);
    User_49 map49(UserProtos.UserDTO userDTO);
    User_50 map50(UserProtos.UserDTO userDTO);
}

