package com.example.dsa;

import com.example.dsa.problems.arrays.easy.*;
import com.example.dsa.problems.arrays.medium.RemoveDuplicatesTwo;
import com.example.dsa.problems.easy.AddBinary;
import com.example.dsa.problems.easy.ClimbStairsFibonachi;
import com.example.dsa.problems.easy.ConvertToTitle;
import com.example.dsa.problems.easy.Palindrome;
import com.example.dsa.problems.hashmap.CanConstruct;
import com.example.dsa.problems.lists.easy.DeleteDuplicates;
import com.example.dsa.problems.lists.easy.IsPalindromeList;
import com.example.dsa.problems.lists.easy.Linky;
import com.example.dsa.problems.strings.*;
import com.example.dsa.problems.tree.InorderTraversal;
import com.example.dsa.problems.tree.MaxDepth;
import com.example.dsa.problems.tree.SameTree;
import com.example.dsa.algorithm.search.BubbleSearch;
import com.example.dsa.algorithm.search.LinearSearch;
import com.example.dsa.algorithm.sorting.MergeSort;
import com.example.dsa.algorithm.sorting.QuickSort;
import com.example.dsa.algorithm.sorting.SelectionSort;
import com.example.dsa.problems.supportive.objects.ListNode;
import com.example.dsa.problems.supportive.SortAlgorithms;
import com.example.dsa.problems.supportive.objects.TreeNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaApplication.class, args);


        // Test data for linear search + // Perform linear search
        int[] testData = {7, 3, 9, 2, 6, 1, 8, 4, 10, 5};
        int[] data = {10, 20, 30, 40, 50};
        int key = 33;
        int resultIndex = LinearSearch.linearSearch(data, key);

        System.out.println("Index of " + key + " in the array is: " + resultIndex);

        //Bubble seach
        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList("Elida Sleight", "Francina Vigneault", "Lucie Hansman", "Nancie Rubalcaba"));
        System.out.println(BubbleSearch.indexOfItem(list, "Lucie Hansman"));
        System.out.println(IsPalindrome.isPalindrome(" "));
        System.out.println(IsSubsequence.isSubsequence("aaaaaa", "bbaaaa"));
        System.out.println(Palindrome.isPalindrome(11411));
        System.out.println(Palindrome.isPalindrome1(11411));
        System.out.println(RomanToInteger.romanToInt3("MCMXCIV"));
        System.out.println(LongestCommonPrefix.longestCommonPrefix(new String[]{"temo", "testar", "tef"}));
        System.out.println(IsValid.isValid("(}{)"));


        //Merge two lists
        ListNode first = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3)))));
        ListNode second = new ListNode(2, new ListNode(3, new ListNode(3)));

        ListNode listNode = Linky.mergeTwoLists(first, second);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode.next != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        arrayList.add(listNode.val);
        System.out.println(arrayList);
        System.out.println(RemoveDuplicates.removeDuplicates(new int[]{1, 1, 1, 2, 2, 4}));
        System.out.println(RemoveDuplicatesTwo.removeDuplicates(new int[]{1, 1, 1, 2, 2, 4}));
        System.out.println(MaxProfit.maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(RemoveElement.removeElement(new int[]{3, 2, 3, 2, 3, 2}, 3));
        System.out.println(StrStr.strStr("mississippi", "issippi"));
        System.out.println(SearchInsert.searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(LengthOfLastWord.lengthOfLastWord("afs"));
        System.out.println(PlusOne.plusOne(new int[]{9, 9, 9}));
        System.out.println(AddBinary.addBinary("1010", "1011"));
        System.out.println(ClimbStairsFibonachi.climbStairs(3));
        System.out.println(DeleteDuplicates.deleteDuplicates(first));
        int[] arg = new int[7];
        arg[0] = 2;
        arg[1] = 3;
        arg[2] = 3;
        arg[3] = 5;
        System.out.println(MergeTwoArrays.merge(arg, 4, new int[]{1, 1, 4}, 3));

        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), null));
        TreeNode rootWithNull = new TreeNode(1, null, new TreeNode(5));
        TreeNode simetricRoot = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        MaxDepth.maxDepthDFS(root);


        SelectionSort.selectionSort(new int[] {7,1,5,3,6,4});
        System.out.println(InorderTraversal.inorderTraversal(root));
        SortAlgorithms.bubbleSort(testData);

        int[] arr = {3, 2, 4, 6};
        int n = arr.length;
        MergeSort.mergeSort(arr);
        QuickSort.quickSort(arr, 0, n-1);
        ConvertToTitle.convertToTitle(2147483647);
        MajorityElement.majorityElement(new int[] {3,3,4});
        SameTree.isSameTree(simetricRoot, simetricRoot);

        ListNode palindrome = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        IsPalindromeList.isPalindrome(palindrome);
        MissingNumber.missingNumber(new int[] {0});
        CanConstruct.canConstruct("aa", "aab");
    }
}

