/*
https://leetcode.com/problems/search-in-a-binary-search-tree/
#700
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;
        if (val == root.val) return root;
        if (val > root.val) return searchBST(root.right, val);
        if (val < root.val) return searchBST(root.left, val);

        return root;
    } // end of method
} // end of class