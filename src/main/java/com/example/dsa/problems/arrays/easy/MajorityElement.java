package com.example.dsa.problems.arrays.easy;

import java.util.*;

public class MajorityElement {
    /*This algorithm finds the majority element in an array, which is the element that appears more than half the time.
    It begins by sorting the array, which means all instances of any element are now next to each other.
     Since the majority element appears more than half the time, after sorting, it must occupy the middle
     position of the array, so the element at the position n/2 (where n is the array's length) is returned. */
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
