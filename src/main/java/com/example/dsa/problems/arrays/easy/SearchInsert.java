package com.example.dsa.problems.arrays.easy;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
           if (nums[i] == target) {
               result = i;
               break;
           } else if (nums[i == 0 ? i : i - 1] < target
                   & nums[i == nums.length - 1 ? i : i + 1] > target) {
               result = i + 1;
               break;
           } else if (i == nums.length - 1 & nums[i] < target) {
               result = i + 1;
               break;
           }
        }
        return result;
    }
}
