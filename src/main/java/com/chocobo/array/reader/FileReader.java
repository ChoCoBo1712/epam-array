package com.chocobo.array.reader;

import com.chocobo.array.exception.CustomArrayException;

import java.util.List;

public interface FileReader {

    List<String> readLinesToList(String filePath) throws CustomArrayException;
}
