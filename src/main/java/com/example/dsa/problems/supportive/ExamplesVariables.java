package com.example.dsa.problems.supportive;

import java.util.Map;

public class ExamplesVariables {

    //Syntax references
    public void test() {
        int[] myArray1;
        int[] myArray2 = {1, 2, 3, 4, 5};
        int[] myArray3 = new int[10]; // Array of size 10
        int[][] my2DArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] my2DArray1 = new int[10][5]; // 10 rows and 5 columns
        int[][] my2DArray2;

        String[] stringArray1;           // Preferred way
        String stringArray2[];           // Works but not preferred
        stringArray1 = new String[5];    // An array of 5 Strings, default value null
        stringArray2 = new String[]{"One", "Two", "Three"}; // An array with initial values
        String[] stringArray3 = {"One", "Two", "Three"}; // Directl

        long[] longArray1;               // Preferred way
        long longArray2[];               // Works but not preferred
        longArray1 = new long[5];        // An array of 5 longs, default value 0
        longArray2 = new long[]{1L, 2L, 3L}; // An array with initial values
        long[] longArray3 = {1L, 2L, 3L}; //initializing an array of Strings

        //cycles
        for (int i = 0; i < 5; i++) {
            System.out.println("For Loop: " + i);
        }

        String[] names = {"Java", "Python", "C++"};
        for (String name : names) {
            System.out.println("Enhanced For Loop: " + name);
        }

        int i = 0;
        while (i < 5) {
            System.out.println("While Loop: " + i);
            i++;
        }

        int j = 0;
        do {
            System.out.println("Do-While Loop: " + j);
            j++;
        } while (j < 5);


        //MAP INITIALIZATION
        Map<Character, Character> map = Map.of('f','f');

        Map<String, Integer> complexMap = Map.ofEntries(
                Map.entry("a", 1),
                Map.entry("b", 2),
                Map.entry("c", 3)
        );
    }
}
