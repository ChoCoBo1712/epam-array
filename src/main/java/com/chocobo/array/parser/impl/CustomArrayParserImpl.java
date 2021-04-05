package com.chocobo.array.parser.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.parser.CustomArrayParser;

import java.util.Arrays;

public class CustomArrayParserImpl implements CustomArrayParser {

    private final static String SPLITTER = ",";

    @Override
    public int[] parse(String line) {
        return Arrays.stream(line.split(SPLITTER))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
