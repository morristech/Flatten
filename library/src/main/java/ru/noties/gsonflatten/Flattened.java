package ru.noties.gsonflatten;

/**
 * Created by Dimitry Ivanov on 29.10.2015.
 */
public interface Flattened<T> {

    T get();
    boolean hasValue();
}
