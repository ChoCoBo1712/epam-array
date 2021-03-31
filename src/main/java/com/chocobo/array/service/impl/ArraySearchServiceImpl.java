package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArraySearchService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySearchServiceImpl implements ArraySearchService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMin(CustomArray array) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }

        int min = array.toIntStream()
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

        int max = array.toIntStream()
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

        long count = array.toIntStream()
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

        long count = array.toIntStream()
                .filter(element -> element < 0)
                .count();
        logger.log(Level.INFO, "Negatives count is " + count);
        return count;
    }
}
