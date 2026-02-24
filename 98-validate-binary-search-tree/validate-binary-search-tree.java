class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode node, long min, long max) {
        if (node == null) return true;  // empty tree is valid BST
        if (node.val <= min || node.val >= max) return false; // violation
        return helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }
}
