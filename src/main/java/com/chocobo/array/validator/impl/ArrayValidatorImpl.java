package com.chocobo.array.validator.impl;

import com.chocobo.array.validator.ArrayValidator;

import java.util.ArrayList;
import java.util.List;

public class ArrayValidatorImpl implements ArrayValidator {

    @Override
    public boolean isValid(String line) {
        String[] numbers = line.split(", ");
        for (String number : numbers) {
            try {
                Integer.parseInt(number);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}
