package com.example.dsa.problems.supportive;

public class SortAlgorithms {

    /*
        1. Insertion Sort
        Technique: Incremental Insertion
        Explanation: Imagine sorting a hand of playing cards. You start with the second card and compare it to the first. If it's smaller, you place it before the first card.
        Then you move to the third card, comparing it backward, placing it in the correct position relative to the first two, and so on.
        Best For: Small datasets or nearly sorted data.
        Time Complexity: O(n^2) generally but can be as efficient as O(n) for nearly sorted data.
        Step-by-Step:
        Start from the second element.
        Compare with elements before it, moving each one step to the right until finding the correct position for the new element.
        Repeat until the array is sorted.

        Step by Step Explanation for Beginners:
        Initial Setup: The algorithm starts with the second element of the array (i = 1) because it assumes the first element (sub-array of one element) is already sorted.
        Key Element: It selects the current element at index i as the key. This is the element to be inserted into the sorted portion of the array (everything to the left of i).
        Finding the Correct Position for Key: The algorithm then compares the key with elements to its left, one by one (j = i - 1 initially). If it finds an element greater than the key, it shifts that element one position to the right (to arr[j + 1]).
        Inserting the Key: This process continues as long as it finds elements greater than the key and j is not out of bounds (j >= 0). When it stops, it means it has found the correct position for the key, or j has reached -1 (the key is smaller than all elements to its left). It then inserts the key into its correct position (arr[j + 1] = key).
        Repeating for Each Element: This process is repeated for each element in the array, one by one, until the entire array is sorted.
    */
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

        /* Move elements of arr[0..i-1], that are
           greater than key, to one position ahead
           of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /*
        2. Selection Sort
        Technique: Selection
        Explanation: You look for the smallest (or largest, depending on sorting order) element in the array and swap it with the element in the first position.
        Then, repeat the process for the remainder of the array (i.e., except the first element) until the whole array is sorted.
        Best For: Simplicity and small datasets.
        Time Complexity: O(n^2) for all cases.
        Step-by-Step:
        Start with the first element as the minimum.
        Search the minimum element in the rest of the array.
        Swap it with the first element.
        Repeat the process for each position in the array.
    */
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    /*
        3. Bubble Sort
        Technique: Exchanging
        Explanation: You repeatedly step through the list, compare adjacent elements, and swap them if they are in the wrong order. The process repeats until no swaps are needed, which means the array is sorted.
        Best For: Educational purposes to understand sorting mechanisms.
        Time Complexity: O(n^2) generally, but O(n) if the array is already sorted.
        Step-by-Step:
        Compare the first two elements, and swap if the first is larger.
        Move to the next pair, repeat the comparison and swap if necessary.
        Continue until the end of the array; this completes one full pass.
        Repeat the passes until no swaps are needed.

    * */
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }


    /*
       4. Merge Sort
       Technique: Divide and Conquer
        Explanation: Imagine dividing your entire music playlist into halves until each list contains just one song. Then, you merge every pair of lists into a sorted list until you get a single sorted playlist back.
        Best For: Large datasets.
        Time Complexity: O(n log n) in all cases.
        Step-by-Step:
        Divide the unsorted list into n sublists, each containing one element.
        Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining.
       */

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public static void  merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /*
    * 5. Quick Sort
    * Technique: Divide and Conquer
        Explanation: Like choosing a pivot in dodgeball, where players quicker (or slower) than the pivot go to one side of the gym, and those not, to the other. This process repeats with smaller groups until everyone is sorted by speed.
        Best For: Large datasets.
        Time Complexity: Average O(n log n), but worst-case O(n^2).
        Step-by-Step:
        Pick an element, called a pivot, from the array.
        Partitioning: reorder the array so that all elements with values less than the pivot come before it, while all elements with values greater come after it.
        Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.
        * */

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If the current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void quickSort(int arr[], int low, int high) {
        if (low < high) {
        /* pi is partitioning index, arr[pi] is
          now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

}
