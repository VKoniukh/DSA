package com.example.dsa.problems.arrays.medium;

public class RemoveDuplicatesTwo {
    /*The removeDuplicates function in this algorithm is designed to maintain at most two occurrences of each element
     in a sorted array. It iterates through the array, and for each number, it checks if there are less than
     two elements or if the current number is greater than the element two positions back. If either condition is met,
     it copies the current number to the front of the array and updates the count of unique elements, which is returned at the end. */
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2]) {
                nums[i] = n;
                i++;
            }
        return i;
    }
}
