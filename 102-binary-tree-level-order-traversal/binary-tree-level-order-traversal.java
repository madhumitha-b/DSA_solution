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
    public List<List<Integer>> levelOrder(TreeNode root) {
Queue<TreeNode> queue = new LinkedList<>();
List<List<Integer>> res=new ArrayList<>();
if(root != null) queue.offer(root);  //  Fix 1

while(!queue.isEmpty()) {
    int levelSize = queue.size();      //  Fix 2
    List<Integer> currentLevel = new ArrayList<>();
    
    for(int i = 0; i < levelSize; i++) {  // Process ALL nodes in level
        TreeNode node = queue.poll();
        currentLevel.add(node.val);
        if(node.left != null) queue.offer(node.left);
        if(node.right != null) queue.offer(node.right);
    }
    res.add(currentLevel);
}
return res;

    }
}