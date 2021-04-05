package com.chocobo.array.creator;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public interface CustomArrayCreator {

    CustomArray createFromArgs(int... args) throws CustomArrayException;
}
