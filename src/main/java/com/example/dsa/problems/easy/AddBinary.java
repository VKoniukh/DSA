package com.example.dsa.problems.easy;

public class AddBinary {
    public static String addBinary(String a, String b) {
        // We use StringBuilder to efficiently build the result string from end to start
        StringBuilder sb = new StringBuilder();
        // Start from the end of both strings
        int i = a.length() - 1, j = b.length() - 1;
        // This will hold any carry over during addition
        int carry = 0;

        // Continue loop until both strings are fully traversed
        while (i >= 0 || j >= 0) {
            // Begin with carry value from previous calculation
            int sum = carry;
            // Add bit from a if available
            if (i >= 0)  {
                sum += a.charAt(i) - '0'; // Convert char to int
            }
            // Add bit from b if available
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char to int
            }
            // Modulo by 2 gets the remainder which is the result bit to append
            sb.append(sum % 2);
            // Division by 2 gets the carry
            carry = sum / 2;

            // Move to the next bits
            i--;
            j--;
        }

        // If there's a carry left at the end, append it
        if (carry != 0) sb.append(carry);
        // Since we've built the string backwards, reverse it to get the correct order
        return sb.reverse().toString();
    }
}
