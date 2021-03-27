package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;

public class ArraySearcher {
    public static int getMin(CustomArray array) {
        int min = array.getElement(0);

        for (int i = 1; i < array.getLength(); i++) {
            if (array.getElement(i) < min) {
                min = array.getElement(i);
            }
        }

        return min;
    }

    public static int getMax(CustomArray array) {
        int max = array.getElement(0);

        for (int i = 1; i < array.getLength(); i++) {
            if (array.getElement(i) > max) {
                max = array.getElement(i);
            }
        }

        return max;
    }

    public static int getPositivesCount(CustomArray array) {
        int count = 0;

        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) >= 0) {
                count++;
            }
        }

        return count;
    }

    public static int getNegativesCount(CustomArray array) {
        int count = 0;

        for (int i = 0; i < array.getLength(); i++) {
            if (array.getElement(i) < 0) {
                count++;
            }
        }

        return count;
    }
}
