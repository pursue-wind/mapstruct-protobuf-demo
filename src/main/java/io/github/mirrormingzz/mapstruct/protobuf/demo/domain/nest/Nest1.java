package io.github.mirrormingzz.mapstruct.protobuf.demo.domain.nest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nest1 {
    private String a1;
    private List<Nest2> nest2;
}
