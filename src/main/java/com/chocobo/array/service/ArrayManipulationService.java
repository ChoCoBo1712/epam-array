package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public interface ArrayManipulationService {

    void replaceNegatives(CustomArray array, int number) throws CustomArrayException;
    void replacePositives(CustomArray array, int number) throws CustomArrayException;
}
