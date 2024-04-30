package com.example.dsa.problems.lists.easy;

import com.example.dsa.problems.supportive.objects.ListNode;

import java.util.Stack;

public class IsPalindromeList {

    //With Floyd's Cycle Detection Algorithm.
    //space complexity of only O(1)  time complexity of O(N).
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;

        //With Floyd's Cycle Detection Algorithm. (fast going twice faster and when and the slow should be in the middle)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }


    //Naive approach
    public static boolean isPalindromeNaive(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        ListNode pointer = head;

        while (pointer != null) {
            stack.push(pointer);
            pointer = pointer.next;
        }

        int middle = stack.size() / 2;

        for (int i = 0; i < middle; i++) {
            if (head.val != stack.pop().val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }

}
