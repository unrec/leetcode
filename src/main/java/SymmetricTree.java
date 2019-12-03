/*
https://leetcode.com/problems/symmetric-tree/
#101
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
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    } // end of method

    public boolean isMirror(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        return (p.val == q.val
                && isMirror(p.left, q.right)
                && isMirror(p.right, q.left));

    } // end of method
} // end of class