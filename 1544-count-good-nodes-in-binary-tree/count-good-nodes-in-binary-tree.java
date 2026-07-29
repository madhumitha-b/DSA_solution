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

    int cnt=0;

    void recursion(TreeNode root,int maxi){

        if(root == null) return ;

        if(maxi<=root.val){
            maxi=root.val;
            cnt++;
        }
        recursion(root.left,maxi);
        recursion(root.right,maxi);
    }

    public int goodNodes(TreeNode root) {
        
        recursion(root,Integer.MIN_VALUE);
        return cnt;
    }
}