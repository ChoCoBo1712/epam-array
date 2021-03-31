package com.chocobo.array.entity;

import com.chocobo.array.exception.CustomArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class CustomArrayTest {

    public CustomArray createArray() throws CustomArrayException {
        CustomArray array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i + 1);
        }
        return array;
    }

    @Test
    public void getElementTest() throws CustomArrayException {
        int actual = createArray().getElement(3);
        int expected = 4;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void getElementExceptionTest() throws CustomArrayException {
        createArray().getElement(-1);
    }

    @Test
    public void setElementTest() throws CustomArrayException {
        CustomArray array = createArray();
        array.setElement(0, 10);
        int actual = array.getElement(0);
        int expected = 10;
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void setElementExceptionTest() throws CustomArrayException {
        createArray().setElement(5, 10);
    }

    @Test
    public void getLengthTest() throws CustomArrayException {
        int actual = createArray().getLength();
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void toIntStreamTest() throws CustomArrayException {
        int[] primitivesArray = new int[]{1, 2, 3, 4, 5};

        IntStream actualStream = createArray().toIntStream();
        IntStream expectedStream = IntStream.of(primitivesArray);
        int[] actual = actualStream.toArray();
        int[] expected = expectedStream.toArray();
        Assert.assertEquals(actual, expected);
    }
    // TODO: add tests for reader, parser, validator
}
