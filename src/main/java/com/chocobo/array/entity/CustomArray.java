package com.chocobo.array.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class CustomArray {

    static final Logger logger = LogManager.getLogger();
    private final int[] collection;

    public CustomArray(int length) {
        if (length < 1) {
            throw new IllegalArgumentException();
        }
        collection = new int[length];
        logger.log(Level.INFO, "Array created");
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
