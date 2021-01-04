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
public interface TestGen260Mapper {

TestGen260Mapper INSTANCE = Mappers.getMapper(TestGen260Mapper.class);

    User_261 map261(UserProtos.UserDTO userDTO);
    User_262 map262(UserProtos.UserDTO userDTO);
    User_263 map263(UserProtos.UserDTO userDTO);
    User_264 map264(UserProtos.UserDTO userDTO);
    User_265 map265(UserProtos.UserDTO userDTO);
    User_266 map266(UserProtos.UserDTO userDTO);
    User_267 map267(UserProtos.UserDTO userDTO);
    User_268 map268(UserProtos.UserDTO userDTO);
    User_269 map269(UserProtos.UserDTO userDTO);
    User_270 map270(UserProtos.UserDTO userDTO);
}

