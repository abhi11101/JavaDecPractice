package org.com.abhi.Chapter11_20.Chapter15.GenericFunctionalInterface;

@FunctionalInterface
public interface GenericInterface<T> {

    T operate(T value1, T value2);
}
