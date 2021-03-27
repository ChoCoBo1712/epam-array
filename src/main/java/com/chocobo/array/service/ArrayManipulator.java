package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;

public class ArrayManipulator {
    public static void replaceNegatives(CustomArray array, int number) {
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) < 0) {
                array.setElement(i, number);
            }
        }
    }

    public static void replacePositives(CustomArray array, int number) {
        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) < 0) {
                array.setElement(i, number);
            }
        }
    }
}
