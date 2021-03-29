package com.chocobo.array.parser;

import java.util.stream.Stream;

public interface StreamParser {

    String[] parseStream(Stream<String> lines);
}
