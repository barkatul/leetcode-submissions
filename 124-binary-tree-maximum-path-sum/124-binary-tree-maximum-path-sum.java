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
    int max;
    public int maxPathSum(TreeNode root) {
        
        max=root.val;
        
        if(root.left == null && root.right == null)
            return root.val;
        
        int a=path(root);
        
        return max;
    }
    
    public int path(TreeNode node){
        
        if(node == null)
            return 0;
        
        int lh=path(node.left);
        int rh=path(node.right);
        
        if(lh < 0)
            lh=0;
        if(rh < 0)
            rh=0;
        
        max=Math.max(max,lh+rh + node.val);
        
        return node.val+Math.max(lh,rh);
    }
}