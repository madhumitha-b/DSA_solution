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

int height(TreeNode node) {
    if(node == null) return 0;
    
    int leftH = height(node.left);
    int rightH = height(node.right);
    
    // ANY imbalance? Early exit!
    if(leftH == -1 || rightH == -1 || Math.abs(leftH-rightH) > 1)
        return -1;
        
    return 1 + Math.max(leftH, rightH);
}

boolean isBalanced(TreeNode root) {
    return height(root) != -1;
}
}