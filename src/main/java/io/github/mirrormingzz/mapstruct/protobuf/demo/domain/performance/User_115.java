package io.github.mirrormingzz.mapstruct.protobuf.demo.domain.performance;
import com.google.protobuf.ByteString;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.user.Department;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.user.MultiNumber;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.user.Status;
import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User_115 {

double v1;
float v2;
int v3;
long v4;
int v5;
long v6;
int v7;
long v8;
int v9;
long v10;
int v11;
long v12;
boolean v13;
String v14;
ByteString v15;
Status v16;
User user;
List<Double> rv1;
List<Float> rv2;
List<Integer> rv3;
List<Long> rv4;
List<Integer> rv5;
List<Long> rv6;
List<Integer> rv7;
List<Long> rv8;
List<Integer> rv9;
List<Long> rv10;
List<Integer> rv11;
List<Long> rv12;
List<Boolean> rv13;
List<String> rv14;
List<ByteString> rv15;
List<Status> rv16;
MultiNumber multiNumber;
List<MultiNumber> repMultiNumbers;
private String id;
private String email;
private List<Department> mainDepartments = new ArrayList<>();
private List<Department> departments = new ArrayList<>();
private String nonRepeatableFieldWithSuffixList;
private List<User> users;
}
