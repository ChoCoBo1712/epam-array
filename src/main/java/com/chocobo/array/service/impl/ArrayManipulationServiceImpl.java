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
        for (int i = 0; i < array.getLength(); i++) {
            try {
                if (array.getElement(i) < 0) {
                    array.setElement(i, number);
                }
            } catch (CustomArrayException e) {
                logger.log(Level.ERROR, "Index out of bounds");
                throw e;
            }
        }
        logger.log(Level.INFO, "Negatives replaced with " + number + ": " + array.toString());
    }

    @Override
    public void replacePositives(CustomArray array, int number) throws CustomArrayException {
        for (int i = 0; i < array.getLength(); i++) {
            try {
                if (array.getElement(i) >= 0) {
                    array.setElement(i, number);
                }
            } catch (CustomArrayException e) {
                logger.log(Level.ERROR, "Index out of bounds");
                throw e;
            }
        }
        logger.log(Level.INFO, "Positives replaced with " + number + ": " + array.toString());
    }
}
