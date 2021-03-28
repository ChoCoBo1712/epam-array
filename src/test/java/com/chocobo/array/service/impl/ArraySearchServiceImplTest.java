package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import org.testng.annotations.BeforeClass;

public class ArraySearchServiceImplTest {

    private CustomArray array;

    @BeforeClass
    public void setUp() throws CustomArrayException {
        array = new CustomArray(5);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, i + 1);
        }
    }
}
