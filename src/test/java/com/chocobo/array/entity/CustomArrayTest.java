package com.chocobo.array.entity;

import com.chocobo.array.exception.CustomArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomArrayTest {

    private CustomArray array;

    @BeforeClass
    public void setUp() throws CustomArrayException {
        array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i + 1);
        }
    }

    @Test
    public void getElementTest() throws CustomArrayException {
        int actual = array.getElement(3);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void getElementExceptionTest() throws CustomArrayException {
        array.getElement(-1);
    }

    @Test
    public void setElementTest() throws CustomArrayException {
        array.setElement(0, 10);
        int actual = array.getElement(0);
        int expected = 10;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void setElementExceptionTest() throws CustomArrayException {
        array.setElement(5, 10);
    }

    @Test
    public void getLengthTest() {
        int actual = array.getLength();
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }
}
