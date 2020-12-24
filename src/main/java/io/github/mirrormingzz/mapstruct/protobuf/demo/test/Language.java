package io.github.mirrormingzz.mapstruct.protobuf.demo.test;

@FunctionalInterface
public interface Language<T> {
    //1 英文
    //2 中文
    String handler(Integer lan, T t);
}
