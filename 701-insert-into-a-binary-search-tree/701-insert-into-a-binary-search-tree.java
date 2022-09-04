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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root==null)
        {
            TreeNode node = new TreeNode(val);
            return node;
        }
        find(root,val);
        return root;
    }
    public void find(TreeNode root,int val)
    {
        if(root.val < val)
        {
            if(root.right == null)
            {
                TreeNode node = new TreeNode(val);
                root.right=node;
            }
            else
            {
                find(root.right,val);
            }
        }
        else
        {
            if(root.left == null)
            {
                TreeNode node = new TreeNode(val);
                root.left=node;
            }
            else
            {
                find(root.left,val);
            }
        }
        return;
    }
}