package com.burt.laoma.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArray<E> {
    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private Object[] elementData;

    public DynamicArray() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {

        int oldCapacity = elementData.length;
        if (oldCapacity >= minCapacity) {
            return;
        }

        int newCapacity = oldCapacity * 2;

        if (newCapacity < minCapacity) {
            newCapacity = minCapacity;
        }
        elementData = Arrays.copyOf(elementData, newCapacity);

    }

    public void add(E e) {
        ensureCapacity(size + 1);
        elementData[size++] = e;
    }


    public E get(int index) {
        ArrayList<String> list;
        return (E) elementData[index];
    }

    public int size() {
        return size;
    }

    public E set(int index, E e) {
        E oldVal = get(index);
        elementData[index] = e;
        return oldVal;
    }

    public void addAll(DynamicArray<? extends E> arr) {
        for (int i = 0; i < arr.size; i++) {
            add(arr.get(i));
        }
    }

    public static void main(String[] args) {

        DynamicArray<Number> numbers = new DynamicArray<>();

        DynamicArray<Integer> ints = new DynamicArray<>();

        ints.add(100);
        ints.add(200);

        numbers.addAll(ints);
    }
}
