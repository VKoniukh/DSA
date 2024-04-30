package com.example.dsa.algorithm.sorting;

public class InsertionSort {
    public static void insertionSort(int[] ints) {
        for(int i = 1; i < ints.length; ++i) {
            int key = ints[i];
            int j = i - 1;

            while (j >= 0 && ints[j] > key) {
                ints[j + 1] = ints[j];
                j = j - 1;
            }
            ints[j + 1] = key;
        }
    }
}
