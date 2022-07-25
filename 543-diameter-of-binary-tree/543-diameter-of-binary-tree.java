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
    int max=0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null)
            return 0;
        
        int lh=height(root.left);
        int rh=height(root.right);
        
        max=Math.max(lh+rh,max);
        
        int c=diameterOfBinaryTree(root.left);
        int d=diameterOfBinaryTree(root.right);
        
        return max;
        
    }
    
    public int height(TreeNode node){
        if(node == null){
            return 0;
        }
        
        int lh= height(node.left);
        int rh= height(node.right);
        
        return 1+Math.max(lh,rh);
    }
}