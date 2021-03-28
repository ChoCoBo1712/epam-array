package com.chocobo.array.validator.impl;

import com.chocobo.array.validator.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayValidatorImpl implements ArrayValidator {

    @Override
    public List<Integer> validate(String line) {
        List<Integer> numbers = new ArrayList<>();
        String[] strings = line.split(", ");
        for (String string : strings) {
            try {
                numbers.add(Integer.parseInt(string));
            } catch (NumberFormatException e) {
                return new ArrayList<>();
            }
        }

        return numbers;
    }
}
