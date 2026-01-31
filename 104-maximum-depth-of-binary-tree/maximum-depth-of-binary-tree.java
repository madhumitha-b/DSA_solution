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
    int maxi=0;
    void traverse(TreeNode tmp,int cnt){

        if(tmp==null){
        return ;
        }
        if(tmp.left==null&&tmp.right==null)
        {
            cnt++;
            maxi=Math.max(maxi,cnt);
        }
        cnt++;
        traverse(tmp.left,cnt);
        traverse(tmp.right,cnt);
    }

    public int maxDepth(TreeNode root) {
        
        TreeNode tmp =root;
        int cnt=0;
        traverse(tmp,cnt);
        return maxi;
    }
}