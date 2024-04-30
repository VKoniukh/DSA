package com.example.dsa.problems.arrays.easy;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        if(nums.length <= 1) {
            return nums[nums.length-1] == 1 ? 0 : 1;
        }


        Arrays.sort(nums);

        int counter = nums.length - 1;
        int binaryCounter = nums.length;


        while (counter != 0) {
            if(nums.length - 1 < 2) {
                if(nums[counter] != binaryCounter) {
                    return binaryCounter;
                }
                binaryCounter--;
            }

            if(nums[counter] != counter) {
                return counter;
            }
            counter--;
        }
        return 0;
    }
}
