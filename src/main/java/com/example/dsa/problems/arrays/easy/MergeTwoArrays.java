package com.example.dsa.problems.arrays.easy;

public class MergeTwoArrays {
    /*
    The main idea is to merge two sorted arrays by comparing their elements from the end, placing the larger current
    element into the last unoccupied position of the first array,
    which is initially set aside with enough space. By using three pointers, the algorithm iterates
    backwards through both arrays, efficiently merging them into a single sorted array without needing additional space for the results.
    This process continues until all elements from the second array are merged into the first.
 */

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        return nums1;
    }
}
