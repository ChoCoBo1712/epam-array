package com.chocobo.array.service;

import com.chocobo.array.entity.CustomArray;
import com.chocobo.array.exception.CustomArrayException;

public interface ArraySortService {

    void quickSort(CustomArray array) throws CustomArrayException;
    void insertionSort(CustomArray array) throws CustomArrayException;
    void selectionSort(CustomArray array) throws CustomArrayException;
}
