package com.example.dsa.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class ConvertToTitle {
    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    }
}
