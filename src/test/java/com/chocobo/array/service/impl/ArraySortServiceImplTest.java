package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArraySortService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArraySortServiceImplTest {

    private CustomArray array;
    private CustomArray sortedArray;
    private ArraySortService service;

    @BeforeClass
    public void setUp() throws CustomArrayException {
        array = new CustomArray(5);
        sortedArray = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, array.getLength() - i);
            sortedArray.setElement(i, i + 1);
        }

        service = new ArraySortServiceImpl();
    }

    @Test
    public void insertionSortTest() throws CustomArrayException {
        service.insertionSort(array);
        Assert.assertEquals(array, sortedArray);
    }

    @Test
    public void selectionSortTest() throws CustomArrayException {
        service.selectionSort(array);
        Assert.assertEquals(array, sortedArray);
    }

    @Test
    public void quickSortTest() throws CustomArrayException {
        service.quickSort(array);
        Assert.assertEquals(array, sortedArray);
    }
}
