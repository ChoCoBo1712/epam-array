package com.chocobo.array.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayValidatorTest {

    @Test
    public void isValidTrueTest() {
        boolean expected = true;

        boolean actual = ArrayValidator.isValid("1, 2, 3, 4, 5");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void isValidFalseTest() {
        boolean expected = false;

        boolean actual = ArrayValidator.isValid("a1, 2, 3, 4, 5");
        Assert.assertEquals(actual, expected);
    }
}
