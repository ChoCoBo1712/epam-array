package com.chocobo.array.creator.impl;

import com.chocobo.array.creator.CustomArrayCreator;
import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayCreatorImplTest {

    private final CustomArrayCreator creator = new CustomArrayCreatorImpl();

    @Test
    public void createFromArgsTest() throws CustomArrayException {
        CustomArray expected = new CustomArray(5);
        for (int i = 0; i < expected.getLength(); i++) {
            expected.setElement(i, i + 1);
        }

        CustomArray actual = creator.createFromArgs(1, 2, 3, 4, 5);
        Assert.assertEquals(actual, expected);
    }
}
