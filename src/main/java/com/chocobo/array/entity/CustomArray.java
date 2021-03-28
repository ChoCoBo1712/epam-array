package com.chocobo.array.entity;

import com.chocobo.array.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArray {

    private static final Logger logger = LogManager.getLogger();
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
        logger.log(Level.INFO, "Element passed");
        return collection[index];
    }

    public void setElement(int index, int number) throws CustomArrayException {
        if (index < 0 || index >= collection.length) {
            throw new CustomArrayException("Index out of bounds");
        }
        collection[index] =  number;
        logger.log(Level.INFO, "Element set");
    }

    public int getLength() {
        logger.log(Level.INFO, "Length passed");
        return collection.length;
    }
}
