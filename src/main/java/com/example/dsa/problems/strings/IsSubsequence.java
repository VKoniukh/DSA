package com.example.dsa.problems.strings;

import java.util.HashMap;
import java.util.Map;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty() && t.isEmpty()) {
            return true;
        } else if (s.isEmpty() && !t.isEmpty()) {
            return true;
        } else if (!s.isEmpty() && t.isEmpty()) {
            return false;
        }

        int j = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= s.length() - 1; i++) {
            while (j <= t.length() - 1) {
                if (s.charAt(i) == t.charAt(j)) {
                    sb.append(t.charAt(j));
                    j++;
                    break;
                }
                j++;
            }
        }

        if (!sb.toString().isEmpty()) {
            return sb.toString().equals(s);
        }
        return false;
    }
}
