package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArraySearchService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySearchServiceImplTest {

    private final ArraySearchService service = new ArraySearchServiceImpl();

    @Test
    public void findMinTest() throws CustomArrayException {
        CustomArray array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i + 1);
        }

        int actual = service.findMin(array);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void findMinExceptionTest() throws CustomArrayException {
        service.findMin(null);
    }

    @Test
    public void findMaxTest() throws CustomArrayException {
        CustomArray array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i + 1);
        }

        int actual = service.findMax(array);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void findMaxExceptionTest() throws CustomArrayException {
        service.findMax(null);
    }

    @Test
    public void findPositivesCountTest() throws CustomArrayException {
        CustomArray array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i + 1);
        }

        long actual = service.findPositivesCount(array);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void findPositivesCountExceptionTest() throws CustomArrayException {
        service.findPositivesCount(null);
    }

    @Test
    public void findNegativesCountTest() throws CustomArrayException {
        CustomArray array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i - 2);
        }

        long actual = service.findNegativesCount(array);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void findNegativesCountExceptionTest() throws CustomArrayException {
        service.findNegativesCount(null);
    }
}
