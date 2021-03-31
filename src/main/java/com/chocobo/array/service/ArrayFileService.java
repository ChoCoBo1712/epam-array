package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public interface ArrayFileService {

    CustomArray readFromFile(String filePath) throws CustomArrayException;
}
