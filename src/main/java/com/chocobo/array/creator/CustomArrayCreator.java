package com.chocobo.array.creator;

import com.chocobo.array.entity.CustomArray;

public interface CustomArrayCreator {

    CustomArray createFromArgs(int... args);
}
