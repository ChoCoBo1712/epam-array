package com.chocobo.array.creator.impl;

import com.chocobo.array.creator.CustomArrayCreator;
import com.chocobo.array.entity.CustomArray;

public class CustomArrayCreatorImpl implements CustomArrayCreator {

    @Override
    public CustomArray createFromArgs(int... args) {
        return new CustomArray(args);
    }

}
