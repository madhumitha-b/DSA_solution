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

    void recursion(TreeNode root,PriorityQueue<Integer> pq){

        if(root == null) return ;

        pq.offer(root.val);

        recursion(root.left,pq);
        recursion(root.right,pq);
    }
    public int kthSmallest(TreeNode root, int k) {
    
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    if(root == null || k==0)
    return 0;

     recursion(root,pq);  

     int cnt=k-1; 

     while(!pq.isEmpty() && cnt != 0){
        
        pq.poll();
        cnt--;
     }
     
     return pq.peek();
    }
}