/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int recursion(TreeNode root){

        if(root == null)
        return 0;
        int leftR = 1+recursion(root.left);
        int rightR = 1+recursion(root.right);
        int a=Math.max(leftR,rightR);
        return a;
    }

    public int maxDepth(TreeNode root) {
        
        if(root == null)
        return 0;

        return recursion(root);

    }
}