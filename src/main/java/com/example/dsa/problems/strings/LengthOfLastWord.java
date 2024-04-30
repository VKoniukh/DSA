package com.example.dsa.problems.strings;

public class LengthOfLastWord {
    /*This algorithm finds the length of the last word in a string by iterating backwards from the end of the string.
     It counts the characters until it encounters a space, indicating the start of the last word
     if characters have been counted already (j > 0). If no space is found before characters start,
      it returns the total count of the characters in the last segment, which forms the last word.*/
    public static int lengthOfLastWord(String s) {
        if(s.isEmpty()){
            return 0;
        }

        int j = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                j++;
            } else if (j > 0) {
                return j;
            }
        }
        return j;
    }
}