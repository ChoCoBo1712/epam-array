package com.chocobo.array.validator;

public class ArrayValidator {
    // TODO: change validator
    static public boolean isValid(String line) {
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
