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
    
    public int maxDepth(TreeNode root) {
        
        maxm(root,0);
        
        return max;
    }
    
    public void maxm(TreeNode root, int count){
        
        if(root==null)
        {
            max=Math.max(max,count);
            return;
        }
        
        maxm(root.left,count+1);
        maxm(root.right,count+1);
    }
}