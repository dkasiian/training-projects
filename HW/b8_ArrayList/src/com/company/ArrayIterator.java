package com.company;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] array;
    private int index = 0;

    ArrayIterator(T[] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length && array[index] != null;
    }

    @Override
    public T next() {
        return array[index++];
    }
}
