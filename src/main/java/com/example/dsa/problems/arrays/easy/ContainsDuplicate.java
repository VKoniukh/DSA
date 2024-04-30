package com.example.dsa.problems.arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set= new HashSet();

        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
