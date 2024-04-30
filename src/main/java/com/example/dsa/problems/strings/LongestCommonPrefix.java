package com.example.dsa.problems.strings;

import java.util.*;

public class LongestCommonPrefix {

    /*This algorithm finds the longest common prefix shared among an array of strings by using the first string as the
    initial prefix and then adjusting it iteratively. It checks if the current prefix is a substring starting
    at the beginning (indexOf(prefix) == 0) of each string in the array. If not, it shortens the prefix from
    the end using substring(0, prefix.length()-1) until it matches or becomes an empty string.
     The indexOf method returns the starting index of the first occurrence of the specified substring
      within the string, or -1 if the substring is not found. The substring method returns a new
       string that is a substring of the original string, given the beginning index and optionally the end index.*/

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
