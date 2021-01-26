package io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct;

import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.UserProtos;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.user.*;
import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(collectionMappingStrategy = CollectionMappingStrategy.ADDER_PREFERRED,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        unmappedSourcePolicy = ReportingPolicy.ERROR,
        unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    default String mapString(String in) {
        if ((null == in) || in.isEmpty()) {
            return null;
        }
        return in;
    }

    default Double mapDouble(Double in) {
        return in;
    }

    default MultiNumber map(UserProtos.MultiNumberDTO number) {
        return new MultiNumber();
    }

    default UserProtos.MultiNumberDTO map(MultiNumber number) {
        return UserProtos.MultiNumberDTO.newBuilder().build();
    }

    UserProtos.UserDTO map(User user);

    User map(UserProtos.UserDTO userDTO);

    Permission map(UserProtos.PermissionDTO permissionDTO);

    UserProtos.PermissionDTO map(Permission perm);

    Status map(UserProtos.EnumStatus permissionDTO);

    UserProtos.EnumStatus map(Status perm);

    Department map(UserProtos.DepartmentDTO departmentDTO);

    UserProtos.DepartmentDTO map(Department department);
}
