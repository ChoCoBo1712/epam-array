package com.chocobo.array.entity;

import com.chocobo.array.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class CustomArray {

    private static final Logger logger = LogManager.getLogger();
    private final int[] collection;

    public CustomArray(int length) throws CustomArrayException {
        if (length < 0) {
            logger.log(Level.ERROR, "Illegal length for array");
            throw new CustomArrayException("Illegal length for array");
        }
        collection = new int[length];
    }

    public int getElement(int index) throws CustomArrayException {
        if (index < 0 || index >= collection.length) {
            throw new CustomArrayException("Index out of bounds");
        }
        return collection[index];
    }

    public IntStream toIntStream() {
        int[] clone = collection.clone();
        return IntStream.of(clone);
    }

    public void setElement(int index, int number) throws CustomArrayException {
        if (index < 0 || index >= collection.length) {
            throw new CustomArrayException("Index out of bounds");
        }
        collection[index] =  number;
    }

    public int getLength() {
        return collection.length;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null) {
            return false;
        }

        if (!(object instanceof CustomArray)) {
            return false;
        }

        CustomArray array = (CustomArray) object;

        if (getLength() != array.collection.length) {
            return false;
        }

        for (int i = 0; i < array.collection.length; i++) {
            if (collection[i] != array.collection[i]) {
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 7;
        for (int j : this.collection) {
            result = 31 * result + j;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[");
        for (int j : this.collection) {
            string.append(j);
            string.append(", ");
        }
        string.replace(string.length() - 2, string.length(), "]");
        return string.toString();
    }
}
