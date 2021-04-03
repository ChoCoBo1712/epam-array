package com.chocobo.array.parser;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.parser.impl.CustomArrayParserImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomArrayParserImplTest {

    private final CustomArrayParser parser = new CustomArrayParserImpl();

    @Test
    public void parseTest() throws CustomArrayException {
        CustomArray expected = new CustomArray(5);
        for (int i = 0; i < expected.getLength(); i++) {
            expected.setElement(i, i + 1);
        }

        CustomArray actual = parser.parse("1, 2, 3, 4, 5");
        Assert.assertEquals(actual, expected);
    }
}
