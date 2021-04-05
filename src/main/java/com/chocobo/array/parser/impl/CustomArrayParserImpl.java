package com.chocobo.array.parser.impl;

import com.chocobo.array.parser.CustomArrayParser;

import java.util.Arrays;

import static com.chocobo.array.constants.Constants.SPLITTER;

public class CustomArrayParserImpl implements CustomArrayParser {

    @Override
    public int[] parse(String line) {
        return Arrays.stream(line.split(SPLITTER))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
