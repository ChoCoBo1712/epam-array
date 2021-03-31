package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public interface ArrayCalculationService {

    int findSum(CustomArray array);
    double findAverage(CustomArray array) throws CustomArrayException;
}
