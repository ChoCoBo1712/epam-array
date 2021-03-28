package com.chocobo.array.parser;

import java.util.stream.Stream;

public interface FileParser {

    String[] parseLine(Stream<String> lines);
}
