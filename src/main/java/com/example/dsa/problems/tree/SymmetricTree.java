package com.example.dsa.problems.tree;

import com.example.dsa.problems.supportive.objects.TreeNode;

public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public static boolean isMirror(TreeNode one, TreeNode two) {
        if(one == null && two == null) {
            return true;
        }

        if(one == null || two == null) {
            return false;
        }
        return (one.val == two.val) && isMirror(one.left, two.right) && isMirror(one.right, two.left);
    }
}
