package com.ruoyi.grokking.algorithms.nTree;

import java.util.LinkedList;
import java.util.List;

public class TwoTreePreOrderRecursion {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        return preorderTraversal(root, null);
    }

    public List<Integer> preorderTraversal(TreeNode root, List<Integer> list) {
        if (list == null)
            list = new LinkedList<>();

        // base case
        if (root == null)
            return list;

        // recursive case
        // previous order
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);

        return list;
    }
}
