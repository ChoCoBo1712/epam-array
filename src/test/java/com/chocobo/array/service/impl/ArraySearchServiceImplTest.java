package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayManipulationService;
import com.chocobo.array.service.ArraySearchService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArraySearchServiceImplTest {

    private CustomArray array;
    private CustomArray anotherArray;
    private ArraySearchService service;

    @BeforeClass
    public void setUp() throws CustomArrayException {
        array = new CustomArray(5);
        anotherArray = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i + 1);
            anotherArray.setElement(i, i - 2);
        }

        service = new ArraySearchServiceImpl();
    }

    @Test
    public void findMinTest() throws CustomArrayException {
        int actual = service.findMin(array);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findMaxTest() throws CustomArrayException {
        int actual = service.findMax(array);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findPositivesCountTest() throws CustomArrayException {
        int actual = service.findPositivesCount(array);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNegativesCountTest() throws CustomArrayException {
        int actual = service.findNegativesCount(anotherArray);
        int expected = 2;
        Assert.assertEquals(actual, expected);
    }
}
