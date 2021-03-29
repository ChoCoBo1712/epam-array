package com.chocobo.array.creator;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

import java.io.IOException;
import java.util.List;

public interface ArrayCreator {

    CustomArray createFromString(String line) throws CustomArrayException;
}
