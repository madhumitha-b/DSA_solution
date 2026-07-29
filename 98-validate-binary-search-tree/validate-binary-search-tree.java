class Solution {

    boolean recursion(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }

        // Current node must be within the valid range
        if (root.val <= min || root.val >= max) {
            return false;
        }

        // Left subtree: values must be between min and root.val
        // Right subtree: values must be between root.val and max
        return recursion(root.left, min, root.val) &&
               recursion(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) {

        return recursion(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}