package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;

public class ArrayCalculator {
    public static int getSum(CustomArray array) {
        int sum = 0;

        for (int i = 0; i < array.getLength(); i++) {
            sum += array.getElement(i);
        }

        return sum;
    }

    public static int getAverage(CustomArray array) {
        return getSum(array) / array.getLength();
    }
}
