package com.example.dsa.problems.arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        Stack<Integer> integerStack = new Stack<>();
        boolean isCountered = false;

        for (int i = digits.length - 1; i != -1; i--) {
            if (!isCountered & i != 0 & digits[i] == 9) {
                integerStack.push(0);
            } else if (!isCountered) {
                if ((digits.length - 1 <= 1 || i == 0) & digits[i] == 9) {
                    integerStack.push(0);
                    integerStack.push(1);
                } else {
                    integerStack.push(digits[i] + 1);
                }
                isCountered = true;
            } else {
                integerStack.push(digits[i]);
            }
        }
        int[] ret = new int[integerStack.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integerStack.pop();
        }
        return ret;
    }
}