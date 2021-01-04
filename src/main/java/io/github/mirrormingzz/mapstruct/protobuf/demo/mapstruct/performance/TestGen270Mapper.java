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
public interface TestGen270Mapper {

TestGen270Mapper INSTANCE = Mappers.getMapper(TestGen270Mapper.class);

    User_271 map271(UserProtos.UserDTO userDTO);
    User_272 map272(UserProtos.UserDTO userDTO);
    User_273 map273(UserProtos.UserDTO userDTO);
    User_274 map274(UserProtos.UserDTO userDTO);
    User_275 map275(UserProtos.UserDTO userDTO);
    User_276 map276(UserProtos.UserDTO userDTO);
    User_277 map277(UserProtos.UserDTO userDTO);
    User_278 map278(UserProtos.UserDTO userDTO);
    User_279 map279(UserProtos.UserDTO userDTO);
    User_280 map280(UserProtos.UserDTO userDTO);
}

