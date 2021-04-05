package com.chocobo.array.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArrayValidator {

    private static final Logger logger = LogManager.getLogger();
    private final static String SPLITTER = ",";
    private final static String REGEX = "\\d+";

    static public boolean isValidString(String line) {
        boolean validationResult = Arrays.stream(line.split(SPLITTER))
                .map(String::trim)
                .allMatch(string -> string.matches(REGEX));
        if (validationResult) {
            logger.log(Level.INFO, "Read valid array: " + line);
        } else {
            logger.log(Level.INFO, "Read invalid array: " + line);
        }
        return validationResult;
    }
}
