/*
https://leetcode.com/problems/search-in-a-binary-search-tree/
#700
*/

package tree;

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;
        if (val == root.val) return root;
        if (val > root.val) return searchBST(root.right, val);
        if (val < root.val) return searchBST(root.left, val);

        return root;
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