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
    List<List<Integer>> ans=new ArrayList<>();
    List<String> str=new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        if(root==null)
            return ans;
        
        find(root,"",targetSum,0);
        
        for(int i=0;i<str.size();i++){
            
            String s1=str.get(i);
            String ch[]=s1.split(" ");
            List<Integer> a=new ArrayList<>();
            
            for(int j=0;j<ch.length;j++){
                a.add(Integer.parseInt(ch[j]));
            }
            ans.add(a);
        }
        
        return ans;
    }
    private void find(TreeNode node, String s,int target,int sum)
    {
        sum=sum+node.val;
        s=s+node.val+" ";
        
        if(node.left == null && node.right == null)
        {
            if(sum == target)
            {
                str.add(s);
                return;
            }
        }
        
        if(node.left != null)
        find(node.left,s,target,sum);
        
        if(node.right != null)
        find(node.right,s,target,sum);
        
        return;
    }
}