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
    public int findSum(CustomArray array) throws CustomArrayException {
        int sum = 0;
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
    public int findAverage(CustomArray array) throws CustomArrayException {
        int average = findSum(array) / array.getLength();
        logger.log(Level.INFO, "Array average is " + average);
        return average;
    }
}
