package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayManipulationService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayManipulationServiceImpl implements ArrayManipulationService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void replaceNegatives(CustomArray array, int number) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }


        logger.log(Level.INFO, "Negatives replaced with " + number + ": " + array.toString());
    }

    @Override
    public void replacePositives(CustomArray array, int number) throws CustomArrayException {
        if (array == null) {
            logger.log(Level.ERROR, "Array is null");
            throw new CustomArrayException("Array is null");
        }


        logger.log(Level.INFO, "Positives replaced with " + number + ": " + array.toString());
    }
}
