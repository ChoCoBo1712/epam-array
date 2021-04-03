package com.chocobo.array.main;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;
import com.chocobo.array.parser.CustomArrayParser;
import com.chocobo.array.parser.impl.CustomArrayParserImpl;
import com.chocobo.array.reader.FileReader;
import com.chocobo.array.reader.impl.FileReaderImpl;
import com.chocobo.array.validator.ArrayValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();
    private static final FileReader fileReader = new FileReaderImpl();
    private static final CustomArrayParser parser = new CustomArrayParserImpl();
    public static final String FILE_PATH = "src/main/resources/arrays.txt";

    public static void main(String[] args) throws CustomArrayException {
        try {
            CustomArray array = fileReader.readToStream(FILE_PATH)
                    .filter(ArrayValidator::isValid)
                    .map(parser::parse)
                    .findFirst()
                    .orElseThrow(() -> new CustomArrayException("No valid arrays found"));
            logger.log(Level.INFO, "Got CustomArray: " + array.toString());
        } catch (CustomArrayException e) {
            logger.log(Level.ERROR, e.getMessage());
            throw e;
        }
    }
}
