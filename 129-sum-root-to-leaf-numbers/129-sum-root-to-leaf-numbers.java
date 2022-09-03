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
    int ans=0;
    public int sumNumbers(TreeNode root) {
        if(root==null)
            return 0;
        
        sum(root,0);
        return ans;
    }
    private void sum(TreeNode node, int s)
    {
        if(node==null)
        {
            return;
        }
        s=s*10+node.val;
        
        if(node.left == null && node.right == null)
        {
            ans=ans+s;
            return;
        }
        
        sum(node.left,s);
        sum(node.right,s);
    }
}