package com.example.dsa.problems.arrays.easy;

public class RemoveElement {
    /*This function removes all occurrences of a specified value (val) from an array (nums) by using an index to
    track the position for the next acceptable value. As it iterates through the array, if the current element
    is not equal to val, it places that element at the current index and then increments the index.
    The function returns the new length of the array after all instances of val have been removed, represented by the final value of index.*/
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
