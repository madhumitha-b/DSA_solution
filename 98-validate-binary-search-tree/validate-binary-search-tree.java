class Solution {

    boolean recursion(TreeNode root, long min, long max) {

        if (root == null) {
            return true;
        }

        if (root.val <= min || root.val >= max) {
            return false;
        }

        return recursion(root.left, min, root.val)
            && recursion(root.right, root.val, max);
    }

    public boolean isValidBST(TreeNode root) {
        return recursion(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}