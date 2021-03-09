/*
https://leetcode.com/problems/symmetric-tree/
#101
*/

package tree;

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
    }


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
