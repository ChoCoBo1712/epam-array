package com.chocobo.array.validator;

import java.util.Arrays;

public class ArrayValidator {

    static public boolean isValid(String line) {
        return Arrays.stream(line.split(","))
        .map(String::trim)
        .allMatch(string -> string.matches("\\d+"));
    }
}
