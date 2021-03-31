package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayCalculationService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayCalculationServiceImplTest {

    private final ArrayCalculationService service = new ArrayCalculationServiceImpl();

    public CustomArray createArray() throws CustomArrayException {
        CustomArray array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i + 1);
        }
        return array;
    }

    @Test
    public void findSumTest() throws CustomArrayException {
        long actual = service.findSum(createArray());
        int expected = 15;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void findSumExceptionTest() throws CustomArrayException {
        service.findSum(null);
    }

    @Test
    public void findAverageTest() throws CustomArrayException {
        double actual = service.findAverage(createArray());
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void findAverageExceptionTest() throws CustomArrayException {
        service.findAverage(null);
    }
}
