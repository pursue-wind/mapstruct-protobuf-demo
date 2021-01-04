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
public interface TestGen490Mapper {

TestGen490Mapper INSTANCE = Mappers.getMapper(TestGen490Mapper.class);

    User_491 map491(UserProtos.UserDTO userDTO);
    User_492 map492(UserProtos.UserDTO userDTO);
    User_493 map493(UserProtos.UserDTO userDTO);
    User_494 map494(UserProtos.UserDTO userDTO);
    User_495 map495(UserProtos.UserDTO userDTO);
    User_496 map496(UserProtos.UserDTO userDTO);
    User_497 map497(UserProtos.UserDTO userDTO);
    User_498 map498(UserProtos.UserDTO userDTO);
    User_499 map499(UserProtos.UserDTO userDTO);

}

