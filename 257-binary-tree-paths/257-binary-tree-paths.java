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
    List<String> ans=new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        sol(root,"");
        return ans;
    }
    public void sol(TreeNode node,String s){
        if(node==null)
            return;
    
        if(node != null && node.left == null && node.right == null)
        {
            s=s+"->"+node.val;
            
            ans.add(s.substring(2));
            return;
        }
       
        
        s=s+"->"+node.val;
        
        sol(node.left,s);
        sol(node.right,s);
    }
}