package com.chocobo.array.reader.impl;

import com.chocobo.array.reader.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReaderImpl implements FileReader {

    @Override
    public Stream<String> readFile(String filePath) throws IOException {
        return Files.lines(Path.of(filePath));
    }
}
