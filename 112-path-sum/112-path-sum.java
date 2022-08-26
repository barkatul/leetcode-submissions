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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        if(root == null)
            return false;
        
        return sum(root, targetSum, 0);
        
    }
    private boolean sum(TreeNode node,int target,int sum){
        
        if(node==null)
            return false;
        
        if(node.left == null && node.right == null)
        {
            return sum+node.val == target;
                
        }
        
        boolean p=false;
        if(node.left != null)
            p=(p || sum(node.left, target, sum+node.val));
        
        if(node.right != null)
            p=(p || sum(node.right, target, sum+node.val));
        
        return p;
    }
}