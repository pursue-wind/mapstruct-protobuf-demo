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
public interface TestGen310Mapper {

TestGen310Mapper INSTANCE = Mappers.getMapper(TestGen310Mapper.class);

    User_311 map311(UserProtos.UserDTO userDTO);
    User_312 map312(UserProtos.UserDTO userDTO);
    User_313 map313(UserProtos.UserDTO userDTO);
    User_314 map314(UserProtos.UserDTO userDTO);
    User_315 map315(UserProtos.UserDTO userDTO);
    User_316 map316(UserProtos.UserDTO userDTO);
    User_317 map317(UserProtos.UserDTO userDTO);
    User_318 map318(UserProtos.UserDTO userDTO);
    User_319 map319(UserProtos.UserDTO userDTO);
    User_320 map320(UserProtos.UserDTO userDTO);
}

