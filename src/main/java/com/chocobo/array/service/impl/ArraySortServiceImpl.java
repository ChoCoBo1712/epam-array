package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArraySortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortServiceImpl implements ArraySortService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public void insertionSort(CustomArray array) throws CustomArrayException {
        try {
            for (int i = 1; i < array.getLength(); i++) {
                int current = array.getElement(i);
                int j = i - 1;
                while(j >= 0 && current < array.getElement(j)) {
                    array.setElement(j + 1, array.getElement(j));
                    j--;
                }
                array.setElement(j + 1, current);
            }
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "Index out of bounds");
            throw e;
        }
    }

    @Override
    public void selectionSort(CustomArray array) throws CustomArrayException {
        try {
            for (int i = 0; i < array.getLength(); i++) {
                int min = array.getElement(i);
                int minIndex = i;
                for (int j = i+1; j < array.getLength(); j++) {
                    if (array.getElement(j) < min) {
                        min = array.getElement(j);
                        minIndex = j;
                    }
                }
                int temp = array.getElement(i);
                array.setElement(i, min);
                array.setElement(minIndex, temp);
            }
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "Index out of bounds");
            throw e;
        }
    }

    @Override
    public void quickSort(CustomArray array, int begin, int end) throws CustomArrayException {
        try {
            if (end <= begin) {
                return;
            }
            int pivot = partition(array, begin, end);
            quickSort(array, begin, pivot - 1);
            quickSort(array, pivot + 1, end);
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "Index out of bounds");
            throw e;
        }
    }

    private int partition(CustomArray array, int begin, int end) throws CustomArrayException {
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array.getElement(i) < array.getElement(end)) {
                int temp = array.getElement(counter);
                array.setElement(counter, array.getElement(i));
                array.setElement(i, temp);
                counter++;
            }
        }
        int temp = array.getElement(end);
        array.setElement(end, array.getElement(counter));
        array.setElement(counter, temp);
        return counter;
    }
}
