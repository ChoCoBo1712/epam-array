package com.chocobo.array.validator;

import java.util.Arrays;

public class ArrayValidator {

    private final static String SPLITTER = ",";
    private final static String REGEX = "\\d+";

    static public boolean isValid(String line) {
        return Arrays.stream(line.split(SPLITTER))
        .map(String::trim)
        .allMatch(string -> string.matches(REGEX));
    }
}
