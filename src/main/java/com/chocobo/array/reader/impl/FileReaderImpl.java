package com.chocobo.array.reader.impl;

import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.reader.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class FileReaderImpl implements FileReader {

    @Override
    public List<String> readLinesToList(String filePath) throws CustomArrayException {
        try {
            return Files.lines(Path.of(filePath))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new CustomArrayException(e);
        }
    }
}
