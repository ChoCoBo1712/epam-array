package com.chocobo.array.reader.impl;

import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.reader.FileReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class FileReaderImplTest {

    private final FileReader fileReader = new FileReaderImpl();

    @Test
    public void readToStreamTest() throws CustomArrayException {
        List<String> actual = fileReader.readLinesToList("src/test/resources/files/arraysTest.txt");

        List<String> expected = Arrays.asList("1, 2b, 31, ff, 1", "1, 2, 3, 4, gg", "1, 2, 3, 4, 5");
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void readToStreamExceptionTest() throws CustomArrayException {
        fileReader.readLinesToList("src/test/resources/files/arrayTest.txt");
    }
}
