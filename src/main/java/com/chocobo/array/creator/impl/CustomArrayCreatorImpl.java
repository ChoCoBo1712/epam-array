package com.chocobo.array.creator.impl;

import com.chocobo.array.creator.CustomArrayCreator;
import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public class CustomArrayCreatorImpl implements CustomArrayCreator {

    @Override
    public CustomArray createFromArgs(int... args) throws CustomArrayException {
        CustomArray array = new CustomArray(args.length);
        for (int i = 0; i < array.getLength(); i++) {
            array.setElement(i, args[i]);
        }
        return array;
    }

}
