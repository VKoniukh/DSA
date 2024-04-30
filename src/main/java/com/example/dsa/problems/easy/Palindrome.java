package com.example.dsa.problems.easy;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return (x == reversed) || (x == reversed / 10);
    }

    public static boolean isPalindrome1(int x) {
        if (x < 0) {
            return false;
        }

        int reverce = 0;
        int copy = x;

        while (copy > 0) {
            int digit = copy % 10;
            reverce = reverce * 10 + digit;
            copy /= 10;
        }
        return reverce == x;
    }
}
