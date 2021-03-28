package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayManipulationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayManipulationServiceImpl implements ArrayManipulationService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void replaceNegatives(CustomArray array, int number) throws CustomArrayException {
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) < 0) {
                array.setElement(i, number);
            }
        }
    }

    @Override
    public void replacePositives(CustomArray array, int number) throws CustomArrayException {
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) < 0) {
                array.setElement(i, number);
            }
        }
    }
}
