package com.chocobo.array.entity;

import com.chocobo.array.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class CustomArray {

    static final Logger logger = LogManager.getLogger();
    private final int[] collection;

    public CustomArray(int length) throws CustomArrayException {
        if (length < 0) {
            throw new CustomArrayException("Illegal length for array");
        }
        collection = new int[length];
        logger.log(Level.INFO, "Array created");
    }

    public int getElement(int index) throws CustomArrayException {
        if (index < 0 || index >= collection.length) {
            throw new CustomArrayException("Index out of bounds");
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
