package com.example.dsa.problems.lists.easy;

import com.example.dsa.problems.supportive.objects.ListNode;

public class DeleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val==temp.val) {
                temp.next=temp.next.next;
                continue;
            }
            temp=temp.next;
        }
        return head;
    }
}
