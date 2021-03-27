package com.chocobo.array.entity;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class CustomArray {
    private ArrayList<Integer> collection;
    private int length;

    public CustomArray(int length) {
        if (length < 1) {
            throw new IllegalArgumentException();
        }

        this.length = length;
        collection = new ArrayList<>();

        for(int i = 0; i < length; i++) {
            collection.add(0);
        }
    }

    public int getElement(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        return collection.get(index);
    }

    public void setElement(int index, int number) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }

        collection.set(index, number);
    }

    public int getLength() {
        return length;
    }
}
