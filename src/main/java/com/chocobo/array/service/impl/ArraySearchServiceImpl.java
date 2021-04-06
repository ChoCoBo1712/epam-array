package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArraySearchService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class ArraySearchServiceImpl implements ArraySearchService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMin(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        try {
            int min = array.getElement(0);
            for (int i = 1; i < array.getLength(); i++) {
                if (array.getElement(i) < min) {
                    min = array.getElement(i);
                }
            }
            logger.log(Level.INFO, "Minimal value is " + min);
            return min;

        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "Index out of bounds", e);
            throw e;
        }
    }

    @Override
    public int findMinStream(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        int min = IntStream.of(array.toIntArray())
                .min()
                .orElseThrow(() -> new CustomArrayException("Array length must be greater then zero"));
        logger.log(Level.INFO, "Minimal value is " + min);
        return min;
    }

    @Override
    public int findMax(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        try {
            int max = array.getElement(0);
            for (int i = 1; i < array.getLength(); i++) {
                if (array.getElement(i) > max) {
                    max = array.getElement(i);
                }
            }

            logger.log(Level.INFO, "Maximal value is " + max);
            return max;
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "Index out of bounds", e);
            throw e;
        }
    }

    @Override
    public int findMaxStream(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        int max = IntStream.of(array.toIntArray())
                .max()
                .orElseThrow(() -> new CustomArrayException("Array length must be greater then zero"));
        logger.log(Level.INFO, "Maximal value is " + max);
        return max;
    }

    @Override
    public long findPositivesCount(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        long count = 0;
        for (int i = 0; i < array.getLength(); i++) {
            try {
                if (array.getElement(i) >= 0) {
                    count++;
                }
            } catch (CustomArrayException e) {
                logger.log(Level.ERROR, "Index out of bounds", e);
                throw e;
            }
        }

        logger.log(Level.INFO, "Positives count is " + count);
        return count;
    }

    @Override
    public long findPositivesCountStream(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        long count = IntStream.of(array.toIntArray())
                .filter(element -> element >= 0)
                .count();
        logger.log(Level.INFO, "Positives count is " + count);
        return count;
    }

    @Override
    public long findNegativesCount(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        long count = 0;
        for (int i = 0; i < array.getLength(); i++) {
            try {
                if (array.getElement(i) < 0) {
                    count++;
                }
            } catch (CustomArrayException e) {
                logger.log(Level.ERROR, "Index out of bounds", e);
                throw e;
            }
        }

        logger.log(Level.INFO, "Negatives count is " + count);
        return count;
    }

    @Override
    public long findNegativesCountStream(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        long count = IntStream.of(array.toIntArray())
                .filter(element -> element < 0)
                .count();
        logger.log(Level.INFO, "Negatives count is " + count);
        return count;
    }
}
