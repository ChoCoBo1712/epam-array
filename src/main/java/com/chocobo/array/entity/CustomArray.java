package com.chocobo.array.entity;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class CustomArray {

    private final int[] collection;

    public CustomArray(int length) {
        if (length < 1) {
            throw new IllegalArgumentException();
        }
        collection = new int[length];
    }

    public int getElement(int index) {
        if (index < 0 || index >= collection.length) {
            throw new IndexOutOfBoundsException();
        }
        return collection[index];
    }

    public void setElement(int index, int number) {
        if (index < 0 || index >= collection.length) {
            throw new IndexOutOfBoundsException();
        }
        collection[index] =  number;
    }

    public int getLength() {
        return collection.length;
    }
}
