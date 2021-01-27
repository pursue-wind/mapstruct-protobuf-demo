package io.github.mirrormingzz.mapstruct.protobuf.demo.mapstruct.support;

import io.github.mirrormingzz.mapstruct.protobuf.demo.domain.complex.Test3;

public class ConvertUtil {
    public static <T> String convert(Integer x, Test3 test3) {
        // 自定义逻辑
        return test3.getA4() + x;
    }
}
