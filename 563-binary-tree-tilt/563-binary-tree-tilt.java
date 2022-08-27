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
    
    int sum=0;
    
    public int findTilt(TreeNode root) {
        
        if(root==null)
            return 0;
        
        int a=find(root);
        
        return sum;
    }
    private int find(TreeNode root)
    {
        if(root==null)
            return 0;
        
        if(root.left == null && root.right == null)
            return root.val;
        
        int left=find(root.left);
        int right=find(root.right);
        
        int diff=Math.abs(left-right);
        
        sum=sum+diff;
        
        root.val=root.val+left+right;
        
        return root.val;  
    }
}