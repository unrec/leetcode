/*
https://leetcode.com/problems/same-tree/
#100
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
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;

        if (p != null && q != null)
            return (p.val == q.val &&
                    isSameTree(p.left, q.left) &&
                    isSameTree(p.right, q.right));

        return false;
    } // end of method
} // end of class

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}