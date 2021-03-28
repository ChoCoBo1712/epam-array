package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayCalculationService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayCalculationServiceImplTest {

    private CustomArray array;
    private ArrayCalculationService service;

    @BeforeClass
    public void setUp() throws CustomArrayException {
        array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i + 1);
        }

        service = new ArrayCalculationServiceImpl();
    }

    @Test
    public void findSumTest() throws CustomArrayException {
        int actual = service.findSum(array);
        int expected = 15;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findAverageTest() throws CustomArrayException {
        int actual = service.findAverage(array);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }
}
