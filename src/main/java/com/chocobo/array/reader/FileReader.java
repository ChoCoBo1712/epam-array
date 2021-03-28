package com.chocobo.array.reader;

import java.io.IOException;
import java.util.stream.Stream;

public interface FileReader {

    Stream<String> readFile(String filePath) throws IOException;
}
