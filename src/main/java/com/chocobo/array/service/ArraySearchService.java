package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public interface ArraySearchService {

    int findMin(CustomArray array) throws CustomArrayException;

    int findMax(CustomArray array) throws CustomArrayException;

    long findPositivesCount(CustomArray array) throws CustomArrayException;

    long findNegativesCount(CustomArray array) throws CustomArrayException;
}
