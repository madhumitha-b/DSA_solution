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

    void print(TreeNode tmp,List<Integer> lst){

        if(tmp==null)
        return ;
        print(tmp.left,lst);
        lst.add(tmp.val);
        print(tmp.right,lst);
        if(tmp.left==null && tmp.right == null)
        return ;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst=new ArrayList<>();

        print(root,lst);
        return lst;
    }
}