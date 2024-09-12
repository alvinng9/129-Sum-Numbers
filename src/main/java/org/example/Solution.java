package org.example;

import java.util.ArrayList;

public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        }
    }

    public int sumNumbers(TreeNode root) {
        //create an ArrayList of String to store all strings
        ArrayList<String> temp = new ArrayList<>();
        //check if root is null
        if (root != null) {
            helper(root, "", temp);
        } else {
            return 0;
        }

        int sum = 0;
        //add up all the answers
        for (String here : temp) {
            //convert Strings to integers
            sum += Integer.parseInt(here);
        }
        return sum;
    }

    public void helper(TreeNode root, String temp, ArrayList<String> tempList) {
        //add each node to the path
        temp += root.val;
        //if the node is at the leaf, add the whole path to the ArrayList
        if (root.left == null && root.right == null) {
            tempList.add(temp);
            return;
        }
        //check if left/right is null then follow that path
        if (root.left != null) helper(root.left, temp, tempList);
        if (root.right != null) helper(root.right, temp, tempList);
    }
}
