package com.example.dsa.problems.easy;

public class ClimbStairsFibonachi {
    public static int climbStairs(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result[n] + result[n-1];
    }
}
