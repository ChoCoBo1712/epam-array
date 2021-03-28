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


}
