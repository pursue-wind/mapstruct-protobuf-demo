package io.github.mirrormingzz.mapstruct.protobuf.demo.domain.nest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nest2 {
    private String a2;
    private Nest3 nest3;
}