package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.service.ArrayManipulationService;

public class ArrayManipulationServiceImpl implements ArrayManipulationService {

    public void replaceNegatives(CustomArray array, int number) {
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) < 0) {
                array.setElement(i, number);
            }
        }
    }

    public void replacePositives(CustomArray array, int number) {
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) < 0) {
                array.setElement(i, number);
            }
        }
    }
}
