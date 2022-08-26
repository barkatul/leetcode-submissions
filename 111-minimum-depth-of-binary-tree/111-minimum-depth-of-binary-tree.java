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
    int min=Integer.MAX_VALUE;
    
    public int minDepth(TreeNode root) {
        
        if(root==null)
            return 0;
        
        root=sol(root,1);
        
        return min;
        
    }
    private TreeNode sol(TreeNode node,int count){
        
        if(node==null)
        {
            return null;
        }
        
        TreeNode left=sol(node.left,count+1);
        TreeNode right=sol(node.right,count+1);
        
        if(left == null && right == null)
        {
            min=Math.min(min,count);
        }
        
        return node;
    }
}