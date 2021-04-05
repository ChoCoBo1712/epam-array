package com.chocobo.array.parser.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.parser.CustomArrayParser;
import com.chocobo.array.parser.impl.CustomArrayParserImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayParserImplTest {

    private final CustomArrayParser parser = new CustomArrayParserImpl();

    @Test
    public void parseTest() {
        int[] expected = new int[]{1, 2, 3, 4, 5};

        int[] actual = parser.parse("1, 2, 3, 4, 5");
        Assert.assertEquals(actual, expected);
    }
}
