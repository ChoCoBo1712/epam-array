package com.chocobo.array.reader;

import java.io.IOException;
import java.util.stream.Stream;

public interface FileReader {

    Stream<String> readToStream(String filePath) throws IOException;
}
