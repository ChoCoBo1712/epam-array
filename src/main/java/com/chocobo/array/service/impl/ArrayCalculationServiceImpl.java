package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.service.ArrayCalculationService;

public class ArrayCalculationServiceImpl implements ArrayCalculationService {
    public int findSum(CustomArray array) {
        int sum = 0;
        for (int i = 0; i < array.getLength(); i++) {
            sum += array.getElement(i);
        }
        return sum;
    }

    public int findAverage(CustomArray array) {
        return findSum(array) / array.getLength();
    }
}
