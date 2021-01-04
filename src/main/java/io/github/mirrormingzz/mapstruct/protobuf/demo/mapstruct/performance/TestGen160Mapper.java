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
public interface TestGen160Mapper {

TestGen160Mapper INSTANCE = Mappers.getMapper(TestGen160Mapper.class);

    User_161 map161(UserProtos.UserDTO userDTO);
    User_162 map162(UserProtos.UserDTO userDTO);
    User_163 map163(UserProtos.UserDTO userDTO);
    User_164 map164(UserProtos.UserDTO userDTO);
    User_165 map165(UserProtos.UserDTO userDTO);
    User_166 map166(UserProtos.UserDTO userDTO);
    User_167 map167(UserProtos.UserDTO userDTO);
    User_168 map168(UserProtos.UserDTO userDTO);
    User_169 map169(UserProtos.UserDTO userDTO);
    User_170 map170(UserProtos.UserDTO userDTO);
}

