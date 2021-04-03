package com.chocobo.array.reader;

import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.reader.impl.FileReaderImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.stream.Stream;

public class FileReaderImplTest {

    private final FileReader fileReader = new FileReaderImpl();

    @Test
    public void readToStreamTest() throws CustomArrayException {
        String[] string = {"1, 2b, 31, ff, 1", "1, 2, 3, 4, gg", "1, 2, 3, 4, 5"};
        Stream<String> expectedStream = Stream.of(string);
        Object[] expected = expectedStream.toArray();

        Stream<String> actualStream = fileReader.readToStream("src/main/resources/arrays.txt");
        Object[] actual = actualStream.toArray();
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = CustomArrayException.class)
    public void readToStreamExceptionTest() throws CustomArrayException {
        fileReader.readToStream("src/main/resources/array.txt");
    }
}
