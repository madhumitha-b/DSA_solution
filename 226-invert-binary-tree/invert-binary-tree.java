class Solution {

    void recursion(TreeNode root) {

        if (root == null) {
            return;
        }

        // Swap the left and right subtrees
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Invert the left subtree
        recursion(root.left);

        // Invert the right subtree
        recursion(root.right);
    }

    public TreeNode invertTree(TreeNode root) {

        recursion(root);

        return root;
    }
}