package com.chocobo.array.parser;

import com.chocobo.array.entity.CustomArray;

import java.util.stream.Stream;

public interface CustomArrayParser {

    CustomArray parse(String line);
}
