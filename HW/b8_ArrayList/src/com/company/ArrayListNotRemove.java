package com.company;

import java.util.Iterator;

public class ArrayListNotRemove<T> implements ArrayNotRemove<T> {

    private T[] array;
    private int n;

    ArrayListNotRemove(){
        this.array = (T[]) new Object[2];
        n = 0;
    }

    @Override
    public boolean isEmpty(){
        return n == 0;
    }

    @Override
    public boolean add(T item) {
        // double size of array if necessary
        if (n == array.length)
            resize(2 * array.length);
        // add item
        array[n++] = item;
        return true;
    }

    @Override
    public T get(int index) {
        if (index >= n || index < 0)
            throw new ArrayIndexOutOfBoundsException();
        return array[index];
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public void update(int index, T value) {
        array[index] = value;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(array);
    }

    private void resize(int max){
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < n; i++)
            temp[i] = array[i];
        array = temp;

        // alternative implementation
        // array = java.util.Arrays.copyOf(array, capacity);
    }
}
