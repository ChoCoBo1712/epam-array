package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArraySortService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySortServiceImplTest {

    private final ArraySortService service = new ArraySortServiceImpl();

    public CustomArray createArray() throws CustomArrayException {
        CustomArray array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, array.getLength() - i);
        }
        return array;
    }

    public CustomArray createSortedArray() throws CustomArrayException {
        CustomArray sortedArray = new CustomArray(5);
        for (int i = 0; i < sortedArray.getLength(); i++) {
            sortedArray.setElement(i, i + 1);
        }
        return sortedArray;
    }

    @Test
    public void insertionSortTest() throws CustomArrayException {
        CustomArray actual = createArray();
        CustomArray expected = createSortedArray();

        service.insertionSort(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void insertionSortExceptionTest() throws CustomArrayException {
        service.insertionSort(null);
    }

    @Test
    public void selectionSortTest() throws CustomArrayException {
        CustomArray actual = createArray();
        CustomArray expected = createSortedArray();

        service.selectionSort(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void selectionSortExceptionTest() throws CustomArrayException {
        service.selectionSort(null);
    }

    @Test
    public void quickSortTest() throws CustomArrayException {
        CustomArray actual = createArray();
        CustomArray expected = createSortedArray();

        service.quickSort(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void quickSortExceptionTest() throws CustomArrayException {
        service.quickSort(null);
    }
}
