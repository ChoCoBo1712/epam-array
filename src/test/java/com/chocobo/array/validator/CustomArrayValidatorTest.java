package com.chocobo.array.validator;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.chocobo.array.validator.CustomArrayValidator.isValidString;

public class CustomArrayValidatorTest {

    @Test
    public void isValidTrueTest() {
        Assert.assertTrue(isValidString("1, 2, 3, 4, 5"));
    }

    @Test
    public void isValidTrueNegativeTest() {
        Assert.assertTrue(isValidString("-1"));
    }

    @Test
    public void isValidTruePositiveTest() {
        Assert.assertTrue(isValidString("+1"));
    }


    @Test
    public void isValidFalseTestLetter() {
        Assert.assertFalse(isValidString("a1, 2, 3, 4, 5"));
    }

    @Test
    public void isValidFalseTestSign() {
        Assert.assertFalse(isValidString(":1, 2, 3, 4, 5"));
    }
}
