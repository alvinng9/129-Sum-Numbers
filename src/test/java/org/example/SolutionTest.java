package org.example;

import com.sun.source.tree.Tree;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sumNumbersTest() {
        Solution solution = new Solution();
        Solution.TreeNode root = new Solution.TreeNode(1);
        root.left = new Solution.TreeNode(2);
        root.right = new Solution.TreeNode(3);
        assertEquals(25, solution.sumNumbers(root));
        
        Solution.TreeNode left = new Solution.TreeNode(9);
        left.left = new Solution.TreeNode(5);
        left.right = new Solution.TreeNode(1);
        root = new Solution.TreeNode(4);
        root.left = left;
        root.right = new Solution.TreeNode(0);
        assertEquals(1026, solution.sumNumbers(root));
    }

}