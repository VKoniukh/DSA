package com.example.dsa.problems.arrays.easy;


public class RemoveDuplicates {

    /*
    The removeDuplicates function eliminates duplicates in a sorted array by maintaining a pointer j for
    the last unique element found. As it iterates through the array, it compares each element with the one at the pointer.
    If a new unique element is found, it's moved next to the last unique one, incrementing
    the count of unique elements, which j+1 represents at the end.
    */

    public static int removeDuplicates(int[] arr) {
        int j = 0;
        for(int i = 1; i <= arr.length - 1; i++) {
            if(arr[j] != arr[i]) {
                arr[j+1] = arr[i];
                j++;
            }
        }
        return j+1;
    }
}
