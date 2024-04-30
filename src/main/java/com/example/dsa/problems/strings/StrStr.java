package com.example.dsa.problems.strings;

public class StrStr {
    /*
    * This algorithm searches for a substring needle within a string haystack and returns the starting index
    * of the first occurrence. It iterates over haystack but only up to haystack.length() - needle.length() + 1
    * to ensure there are enough characters left in haystack for needle to fit. This prevents unnecessary comparisons
    * and out-of-bounds errors. When a character in haystack matches the first character of needle,
    *  it uses substring(i, needle.length() + i) to extract the segment of haystack starting at i and spanning the
    * length of needle. It then checks if this segment matches needle.
    *  If a match is found, it returns the index i; otherwise, it returns -1 after all possibilities are exhausted.*/

    public static int strStr(String haystack, String needle) {
        if(haystack.length() == 0 || needle.length() == 0) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}