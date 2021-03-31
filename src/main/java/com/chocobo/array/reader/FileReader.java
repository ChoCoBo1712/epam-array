package com.chocobo.array.reader;

import com.chocobo.array.exception.CustomArrayException;

import java.util.stream.Stream;

public interface FileReader {

    Stream<String> readToStream(String filePath) throws CustomArrayException;
}
