package com.chocobo.array.parser.impl;

import com.chocobo.array.parser.FileParser;

import java.util.stream.Stream;

public class FileParserImpl implements FileParser {

    @Override
    public String[] parseLine(Stream<String> lines) {
        return lines.toArray(String[]::new);
    }
}
