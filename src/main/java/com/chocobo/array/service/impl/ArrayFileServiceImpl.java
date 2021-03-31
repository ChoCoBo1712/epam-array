package com.chocobo.array.service.impl;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.parser.CustomArrayParser;
import com.chocobo.array.parser.impl.CustomArrayParserImpl;
import com.chocobo.array.reader.FileReader;
import com.chocobo.array.reader.impl.FileReaderImpl;
import com.chocobo.array.service.ArrayFileService;
import com.chocobo.array.validator.ArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayFileServiceImpl implements ArrayFileService {

    private static final Logger logger = LogManager.getLogger();

    private final FileReader fileReader = new FileReaderImpl();
    private final CustomArrayParser parser = new CustomArrayParserImpl();

    @Override
    public CustomArray readFromFile(String filePath) throws CustomArrayException {
        try {
            return fileReader.readToStream(filePath)
                    .filter(line -> {
                        boolean validationResult = ArrayValidator.isValid(line);
                        if (validationResult) {
                            logger.log(Level.INFO, "Read valid array: " + line);
                        } else {
                            logger.log(Level.INFO, "Read invalid array: " + line);
                        }
                        return validationResult;
                    })
                    .map(parser::parse)
                    .findFirst()
                    .orElseThrow(() -> new CustomArrayException("No valid arrays found"));
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, e.getMessage());
            throw e;
        }
    }
}
