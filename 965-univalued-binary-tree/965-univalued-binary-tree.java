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
    public boolean isUnivalTree(TreeNode root) {
        
        if(root == null)
            return true;
        
        boolean p=true;
        
        if(root.left != null){
            
            if(root.val != root.left.val)
                p = false;
            
            else
                p = p && isUnivalTree(root.left);
            
        }
        if(root.right != null){
            
            if(root.val != root.right.val)
                p = false;
            else
                p = p && isUnivalTree(root.right);
            
        }
        
        return p;
    }
}