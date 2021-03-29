package com.chocobo.array.parser.impl;

import com.chocobo.array.parser.StreamParser;

import java.util.stream.Stream;

public class StreamParserImpl implements StreamParser {

    @Override
    public String[] parseStream(Stream<String> lines) {
        return lines.toArray(String[]::new);
    }
}
