package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayCalculationService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayCalculationServiceImpl implements ArrayCalculationService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findSum(CustomArray array) {
        int sum = array.toIntStream().sum();
        logger.log(Level.INFO, "Array sum is " + sum);
        return sum;
    }

    @Override
    public double findAverage(CustomArray array) throws CustomArrayException {
        double average = array.toIntStream()
                .average()
                .orElseThrow(() -> new CustomArrayException("Array length must be greater then zero"));
        logger.log(Level.INFO, "Array average is " + average);
        return average;
    }
}
