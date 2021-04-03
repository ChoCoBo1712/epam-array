package com.chocobo.array.parser.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.parser.CustomArrayParser;

import java.util.Arrays;

public class CustomArrayParserImpl implements CustomArrayParser {

    private final static String SPLITTER = ",";

    @Override
    public CustomArray parse(String line) {
        int[] array = Arrays.stream(line.split(SPLITTER))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        return new CustomArray(array);
    }
}
