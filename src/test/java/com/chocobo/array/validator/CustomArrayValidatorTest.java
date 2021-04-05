package com.chocobo.array.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayValidatorTest {

    @Test
    public void isValidTrueTest() {
        boolean expected = true;

        boolean actual = com.chocobo.array.validator.CustomArrayValidator.isValidString("1, 2, 3, 4, 5");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isValidFalseTest() {
        boolean expected = false;

        boolean actual = com.chocobo.array.validator.CustomArrayValidator.isValidString("a1, 2, 3, 4, 5");
        Assert.assertEquals(actual, expected);
    }
}
