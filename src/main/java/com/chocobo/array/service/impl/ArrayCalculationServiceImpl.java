package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayCalculationService;

public class ArrayCalculationServiceImpl implements ArrayCalculationService {

    @Override
    public int findSum(CustomArray array) throws CustomArrayException {
        int sum = 0;
        for (int i = 0; i < array.getLength(); i++) {
            sum += array.getElement(i);
        }
        return sum;
    }

    @Override
    public int findAverage(CustomArray array) throws CustomArrayException {
        return findSum(array) / array.getLength();
    }

}
