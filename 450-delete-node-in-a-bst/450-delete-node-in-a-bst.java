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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return root;
        
        TreeNode target=find(root,key);
        
        if(target == null)
            return root;
        
        target=root;
        
        if(root.val == key)
        {
            return helper(root);
        }
        
        while(root!=null)
        {
            if(root.val > key)
            {
                if(root.left != null && root.left.val == key)
                {
                    root.left=helper(root.left);
                    break;
                }
                else
                {
                    root=root.left;
                }
            }
            else
            {
                if(root.right != null && root.right.val == key)
                {
                    root.right=helper(root.right);
                    break;
                }
                else
                {
                    root=root.right;
                }
            }
        }
        return target;
    }
    private TreeNode rightmost(TreeNode node)
    {
        while(node.right != null)
        {
            node=node.right;
        }
        return node;
    }
    private TreeNode find(TreeNode node,int key)
    {
        if(node == null)
            return null;
        
        if(node.val == key)
            return node;
        
        if(node.val > key)
        {
            node=node.left;
        }
        else
        {
            node=node.right;
        }
        return find(node,key);
    }
    private TreeNode helper(TreeNode root)
    {
        if(root.left == null)
        {
            return root.right;
        }
        else
            if(root.right == null)
                return root.left;
        
        TreeNode rightChild=root.right;
        TreeNode lastRight=rightmost(root.left);
        
        lastRight.right=rightChild;
        
        return root.left;
    }
}