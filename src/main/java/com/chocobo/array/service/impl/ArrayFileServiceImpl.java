package com.chocobo.array.service.impl;

import com.chocobo.array.creator.ArrayCreator;
import com.chocobo.array.creator.impl.ArrayCreatorImpl;
import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.parser.StreamParser;
import com.chocobo.array.parser.impl.StreamParserImpl;
import com.chocobo.array.reader.FileReader;
import com.chocobo.array.reader.impl.FileReaderImpl;
import com.chocobo.array.service.ArrayFileService;
import com.chocobo.array.validator.ArrayValidator;
import com.chocobo.array.validator.impl.ArrayValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.stream.Stream;

public class ArrayFileServiceImpl implements ArrayFileService {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public CustomArray readFromFile(String filePath) throws CustomArrayException, IOException {
        try {
            FileReader fileReader = new FileReaderImpl();
            StreamParser streamParser = new StreamParserImpl();
            ArrayValidator validator = new ArrayValidatorImpl();
            ArrayCreator arrayCreator = new ArrayCreatorImpl();
            Stream<String> stream = fileReader.readToStream(filePath);
            String[] lines = streamParser.parseStream(stream);
            for (String line: lines) {
                if (validator.isValid(line)) {
                    logger.log(Level.INFO, "Read valid array: " + line);
                    return arrayCreator.createFromString(line);
                }
                logger.log(Level.INFO, "Read invalid array: " + line);
            }
            return new CustomArray(0);
        } catch (IOException e) {
            logger.log(Level.ERROR, "Wrong file path");
            throw e;
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, "Array Creation Error");
            throw e;
        }
    }
}
