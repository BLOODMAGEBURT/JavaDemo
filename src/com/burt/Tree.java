package com.burt;

import java.util.ArrayList;
import java.util.List;

public class Tree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    ArrayList<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {

        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }


}
