package com.chocobo.array.reader;

import com.chocobo.array.exception.CustomArrayException;

import java.util.List;

public interface CustomFileReader {

    List<String> readLinesToList(String filePath) throws CustomArrayException;
}
