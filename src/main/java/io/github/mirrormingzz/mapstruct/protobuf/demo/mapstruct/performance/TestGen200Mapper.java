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
public interface TestGen200Mapper {

TestGen200Mapper INSTANCE = Mappers.getMapper(TestGen200Mapper.class);

    User_201 map201(UserProtos.UserDTO userDTO);
    User_202 map202(UserProtos.UserDTO userDTO);
    User_203 map203(UserProtos.UserDTO userDTO);
    User_204 map204(UserProtos.UserDTO userDTO);
    User_205 map205(UserProtos.UserDTO userDTO);
    User_206 map206(UserProtos.UserDTO userDTO);
    User_207 map207(UserProtos.UserDTO userDTO);
    User_208 map208(UserProtos.UserDTO userDTO);
    User_209 map209(UserProtos.UserDTO userDTO);
    User_210 map210(UserProtos.UserDTO userDTO);
    User_211 map211(UserProtos.UserDTO userDTO);
    User_212 map212(UserProtos.UserDTO userDTO);
}

