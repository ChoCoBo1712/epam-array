package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;

public interface ArrayManipulationService {

    void replaceNegatives(CustomArray array, int number);
    void replacePositives(CustomArray array, int number);
}
