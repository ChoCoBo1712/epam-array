package com.chocobo.array.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

import static com.chocobo.array.constants.Constants.SPLITTER;

public class CustomArrayValidator {

    private static final Logger logger = LogManager.getLogger();
    private static final String ONE_OR_MORE_DECIMAL_SYMBOLS_REGEX = "[+-]?\\d+";

    static public boolean isValidString(String line) {
        boolean isValid = Arrays.stream(line.split(SPLITTER))
                .map(String::trim)
                .allMatch(string -> string.matches(ONE_OR_MORE_DECIMAL_SYMBOLS_REGEX));
        if (isValid) {
            logger.log(Level.INFO, "Read valid array: " + line);
        } else {
            logger.log(Level.INFO, "Read invalid array: " + line);
        }
        return isValid;
    }
}
