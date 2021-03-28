package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArraySearchService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySearchServiceImpl implements ArraySearchService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public int findMin(CustomArray array) throws CustomArrayException {
        int min = array.getElement(0);
        for (int i = 1; i < array.getLength(); i++) {
            if (array.getElement(i) < min) {
                min = array.getElement(i);
            }
        }
        return min;
    }

    @Override
    public int findMax(CustomArray array) throws CustomArrayException {
        int max = array.getElement(0);
        for (int i = 1; i < array.getLength(); i++) {
            if (array.getElement(i) > max) {
                max = array.getElement(i);
            }
        }
        return max;
    }

    @Override
    public int findPositivesCount(CustomArray array) throws CustomArrayException {
        int count = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) >= 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int findNegativesCount(CustomArray array) throws CustomArrayException {
        int count = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) < 0) {
                count++;
            }
        }
        return count;
    }
}
