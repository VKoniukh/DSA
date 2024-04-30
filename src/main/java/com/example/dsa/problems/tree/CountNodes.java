package com.example.dsa.problems.tree;

import com.example.dsa.problems.supportive.objects.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        int counter = 0;

        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if(node.left != null) {
                queue.offer(node.left);
            }

            if(node.right != null) {
                queue.offer(node.right);
            }
            counter++;
        }
        return counter;
    }
}
