package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.service.ArrayFileService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class ArrayFileServiceImplTest {

    private ArrayFileService service;

    @BeforeClass
    public void setUp() {
        service = new ArrayFileServiceImpl();
    }

    @Test
    public void readFromFileTest() throws CustomArrayException {
        CustomArray expected = new CustomArray(5);
        for (int i = 0; i < expected.getLength(); i++) {
            expected.setElement(i, i + 1);
        }

        CustomArray actual = service.readFromFile("src/main/resources/arrays.txt");
        Assert.assertEquals(actual, expected);
    }

}
