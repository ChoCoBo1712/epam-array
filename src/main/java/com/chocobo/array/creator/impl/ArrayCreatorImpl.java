package com.chocobo.array.creator.impl;

import com.chocobo.array.creator.ArrayCreator;
import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public class ArrayCreatorImpl implements ArrayCreator {

    @Override
    public CustomArray createFromString(String line) throws CustomArrayException {
        String[] numbers = line.split(", ");
        CustomArray array = new CustomArray(numbers.length);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, Integer.parseInt(numbers[i]));
        }
        return array;
    }
}
