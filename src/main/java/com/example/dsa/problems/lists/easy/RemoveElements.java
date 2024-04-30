package com.example.dsa.problems.lists.easy;

import com.example.dsa.problems.supportive.objects.ListNode;

public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode();

        if(head == null) {
            return null;
        }

        while(head.val == val) {
            if(head.next != null) {
                head = head.next;
            } else if (head.next == null) {
                return null;
            } else {
                return head;
            }
        }

        ListNode iterator = head.next;
        temp = head;
        while(iterator != null) {
            if(iterator.val == val) {
                temp.next = iterator.next;
                iterator = iterator.next;
                continue;
            }
            temp = iterator;
            iterator = iterator.next;
        }
        return head;
    }
}
