package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayCalculationService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayCalculationServiceImpl implements ArrayCalculationService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public long findSum(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        long sum = 0;
        for (int i = 0; i < array.getLength(); i++) {
            try {
                sum += array.getElement(i);
            } catch (CustomArrayException e) {
                logger.log(Level.ERROR, "Index out of bounds");
                throw e;
            }
        }
        logger.log(Level.INFO, "Array sum is " + sum);
        return sum;
    }

    @Override
    public long findSumStream(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        int sum = array.toIntStream().sum();
        logger.log(Level.INFO, "Array sum is " + sum);
        return sum;
    }

    @Override
    public double findAverage(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        double average = (double) findSum(array) / array.getLength();
        logger.log(Level.INFO, "Array average is " + average);
        return average;
    }

    @Override
    public double findAverageStream(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        double average = array.toIntStream()
                .average()
                .orElseThrow(() -> new CustomArrayException("Array length must be greater then zero"));
        logger.log(Level.INFO, "Array average is " + average);
        return average;
    }
}
