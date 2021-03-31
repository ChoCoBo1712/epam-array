package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public interface ArrayCalculationService {

    long findSum(CustomArray array) throws CustomArrayException;

    double findAverage(CustomArray array) throws CustomArrayException;
}
