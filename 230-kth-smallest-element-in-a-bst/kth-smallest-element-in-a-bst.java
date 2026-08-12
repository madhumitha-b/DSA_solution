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

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    void recursion(TreeNode root){

        if(root == null) return ;

        pq.offer(root.val);

        recursion(root.left);
        recursion(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
    
        int res=0;

        recursion(root);

        while(k!=0){
            res=pq.poll();
            k--;
        }
        return res;
    }
}