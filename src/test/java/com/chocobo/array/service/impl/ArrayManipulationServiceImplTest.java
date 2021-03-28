package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayManipulationService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArrayManipulationServiceImplTest {

    private CustomArray array;
    private CustomArray replaceNegativesArray;
    private CustomArray replacePositivesArray;
    private ArrayManipulationService service;

    @BeforeClass
    public void setUp() throws CustomArrayException {
        array = new CustomArray(5);
        replaceNegativesArray = new CustomArray(5);
        replacePositivesArray = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i - 1);
            replaceNegativesArray.setElement(i, i - 1);
            replacePositivesArray.setElement(i, -1);
        }
        replaceNegativesArray.setElement(0, 10);

        service = new ArrayManipulationServiceImpl();
    }

    @Test
    public void replaceNegativesTest() throws CustomArrayException {
        service.replaceNegatives(array, 10);
        Assert.assertEquals(array, replaceNegativesArray);
    }

    @Test
    public void replacePositivesTest() throws CustomArrayException {
        service.replacePositives(array, -1);
        Assert.assertEquals(array, replacePositivesArray);
    }
}
