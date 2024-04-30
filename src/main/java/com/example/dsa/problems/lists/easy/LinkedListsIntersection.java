package com.example.dsa.problems.lists.easy;

import com.example.dsa.problems.supportive.objects.ListNode;

import java.util.HashMap;

public class LinkedListsIntersection {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }

        HashMap<Integer, ListNode> store = new HashMap<>();

        while(headA.next != null) {
            store.put(headA.val, headA.next);
            headA = headA.next;
        }

        while(headB.next != null) {
            if (store.containsKey(headB.val) && store.get(headB.val).val == headB.val) {
                return headB;
            }
        }
        return null;
    }
}
