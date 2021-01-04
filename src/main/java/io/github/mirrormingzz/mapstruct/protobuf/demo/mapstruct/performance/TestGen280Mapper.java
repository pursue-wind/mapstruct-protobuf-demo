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
public interface TestGen280Mapper {

TestGen280Mapper INSTANCE = Mappers.getMapper(TestGen280Mapper.class);

    User_281 map281(UserProtos.UserDTO userDTO);
    User_282 map282(UserProtos.UserDTO userDTO);
    User_283 map283(UserProtos.UserDTO userDTO);
    User_284 map284(UserProtos.UserDTO userDTO);
    User_285 map285(UserProtos.UserDTO userDTO);
    User_286 map286(UserProtos.UserDTO userDTO);
    User_287 map287(UserProtos.UserDTO userDTO);
    User_288 map288(UserProtos.UserDTO userDTO);
    User_289 map289(UserProtos.UserDTO userDTO);
    User_290 map290(UserProtos.UserDTO userDTO);
}

