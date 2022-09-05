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
    public int kthSmallest(TreeNode root, int k) {
        
        inorder(root,k);
        return ans;
        
    }
    private void inorder(TreeNode node,int k){
        
        Stack<TreeNode> st=new Stack<>();
        
        while(true)
        {
            if(node != null)
            {
                st.push(node);
                node=node.left;
            }
            else{
                if(st.isEmpty())
                {
                    break;
                }
                    node=st.pop();
                    k--;
                    if(k==0)
                        ans=node.val;
                    node=node.right;
            }
        }
        return;
    }
}