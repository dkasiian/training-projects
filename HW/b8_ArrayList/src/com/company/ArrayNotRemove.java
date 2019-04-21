package com.company;

public interface ArrayNotRemove<T> extends Iterable<T> {
    boolean isEmpty();
    boolean add(T value);
    T get(int index);
    int size();
    void update(int index, T value);
}
