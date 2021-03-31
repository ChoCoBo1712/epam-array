package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public interface ArrayManipulationService {

    CustomArray replaceNegatives(CustomArray array, int number) throws CustomArrayException;

    CustomArray replacePositives(CustomArray array, int number) throws CustomArrayException;
}
