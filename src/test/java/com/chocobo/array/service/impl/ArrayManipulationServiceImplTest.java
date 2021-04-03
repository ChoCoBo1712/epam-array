package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayManipulationService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayManipulationServiceImplTest {

    private final ArrayManipulationService service = new ArrayManipulationServiceImpl();

    public CustomArray createArray() throws CustomArrayException {
        CustomArray array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i - 1);
        }
        return array;
    }

    @Test
    public void replaceNegativesTest() throws CustomArrayException {
        CustomArray actual = createArray();
        CustomArray expected = new CustomArray(5);
        expected.setElement(0, 10);
        for (int i = 1; i < actual.getLength(); i++) {
            expected.setElement(i, i - 1);
        }

        service.replaceNegatives(actual, 10);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void replaceNegativesExceptionTest() throws CustomArrayException {
        service.replaceNegatives(null, 10);
    }

    @Test
    public void replaceNegativesStreamTest() throws CustomArrayException {
        CustomArray array = createArray();
        CustomArray expected = new CustomArray(5);
        expected.setElement(0, 10);
        for (int i = 1; i < array.getLength(); i++) {
            expected.setElement(i, i - 1);
        }

        CustomArray actual = service.replaceNegativesStream(array, 10);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void replaceNegativesStreamExceptionTest() throws CustomArrayException {
        service.replaceNegativesStream(null, 10);
    }

    @Test
    public void replacePositivesTest() throws CustomArrayException {
        CustomArray actual = createArray();
        CustomArray expected = new CustomArray(5);
        for (int i = 0; i < actual.getLength(); i++) {
            actual.setElement(i, i - 1);
            expected.setElement(i, -1);
        }

        service.replacePositives(actual, -1);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void replacePositivesExceptionTest() throws CustomArrayException {
        service.replacePositives(null, 10);
    }

    @Test
    public void replacePositivesStreamTest() throws CustomArrayException {
        CustomArray array = createArray();
        CustomArray expected = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i - 1);
            expected.setElement(i, -1);
        }

        CustomArray actual = service.replacePositivesStream(array, -1);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void replacePositivesStreamExceptionTest() throws CustomArrayException {
        service.replacePositivesStream(null, 10);
    }
}
