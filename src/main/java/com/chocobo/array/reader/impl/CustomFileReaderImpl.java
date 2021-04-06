package com.chocobo.array.reader.impl;

import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.reader.CustomFileReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class CustomFileReaderImpl implements CustomFileReader {

    @Override
    public List<String> readLinesToList(String filePath) throws CustomArrayException {
        try {
            return Files.lines(Path.of(ClassLoader.getSystemResource(filePath).toURI()))
                    .collect(Collectors.toList());
        } catch (IOException | URISyntaxException e) {
            throw new CustomArrayException(e);
        }
    }
}
