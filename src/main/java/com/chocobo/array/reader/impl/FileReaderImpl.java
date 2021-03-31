package com.chocobo.array.reader.impl;

import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.reader.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReaderImpl implements FileReader {

    @Override
    public Stream<String> readToStream(String filePath) throws CustomArrayException {
        try {
            return Files.lines(Path.of(filePath));
        } catch (IOException e) {
            throw new CustomArrayException(e);
        }
    }
}
