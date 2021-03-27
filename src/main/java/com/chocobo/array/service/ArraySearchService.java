package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;

public interface ArraySearchService {

    int findMin(CustomArray array);
    int findMax(CustomArray array);
    int findPositivesCount(CustomArray array);
    int findNegativesCount(CustomArray array);
}
