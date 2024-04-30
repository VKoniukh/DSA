package com.example.dsa.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    /*This algorithm converts a Roman numeral string to an integer by iterating through the string from right to left.
    It uses a map to associate Roman characters with their corresponding integer values. As it processes each character,
    if the current value is less than the value of the character before it, it subtracts this value from the total; otherwise,
    it adds the value to the total. This handles both regular addition of values and the special cases where subtraction is needed, like IV for 4.*/

    public static int romanToInt3(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }

}
