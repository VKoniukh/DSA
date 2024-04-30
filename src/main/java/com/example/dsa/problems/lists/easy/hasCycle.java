package com.example.dsa.problems.lists.easy;

import com.example.dsa.problems.supportive.objects.ListNode;

import java.util.HashMap;
import java.util.Map;

public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        Map map = new HashMap();
        ListNode temp = head;
        while (temp.next != null) {
            map.put(temp, temp.val);

            if (map.containsKey(temp) && map.containsKey(temp.next)) {
                return true;
            }

            temp = temp.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null) {
            return false;
        }

        Map map = new HashMap();
        ListNode temp = head;
        while (temp.next != null) {
            map.put(temp, temp.val);

            if (map.containsKey(temp) && map.containsKey(temp.next)) {
                return true;
            }

            temp = temp.next;
        }
        return false;
    }
}
