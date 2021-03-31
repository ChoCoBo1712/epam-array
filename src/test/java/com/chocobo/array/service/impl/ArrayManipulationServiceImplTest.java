package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayManipulationService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayManipulationServiceImplTest {

    private CustomArray array;
    private ArrayManipulationService service;

    @BeforeClass
    public void setUp() throws CustomArrayException {
        array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i - 1);
        }

        service = new ArrayManipulationServiceImpl();
    }

    @Test
    public void replaceNegativesTest() throws CustomArrayException {
        CustomArray expected = new CustomArray(5);
        expected.setElement(0, 10);
        for (int i = 1; i < array.getLength(); i++) {
            expected.setElement(i, i - 1);
        }

        CustomArray actual = service.replaceNegatives(array, 10);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void replaceNegativesExceptionTest() throws CustomArrayException {
        service.replaceNegatives(null, 10);
    }

    @Test
    public void replacePositivesTest() throws CustomArrayException {
        CustomArray expected = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i - 1);
            expected.setElement(i, -1);
        }

        CustomArray actual = service.replacePositives(array, -1);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void replacePositivesExceptionTest() throws CustomArrayException {
        service.replacePositives(null, 10);
    }
}
