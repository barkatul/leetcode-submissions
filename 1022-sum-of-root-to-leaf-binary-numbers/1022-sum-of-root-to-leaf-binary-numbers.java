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
    public int sumRootToLeaf(TreeNode root) {
        
        int sum=0;
        
        List<String> list=find(root,"");
        
        for(int i=0;i<list.size();i++){
            
            String str=list.get(i);
            
            int a=0;
            for(int j=str.length()-1;j>=0;j--){
                
                if(str.charAt(j)=='1')
                {
                    sum=sum+(int)Math.pow(2,a);
                }
                a++;
                
            }
            
        }
        return sum;
    }
    
    public List<String> find(TreeNode node, String s){
        
        if(node == null)
        {
            List<String> list=new ArrayList<>();
            return list;
        }
        
        if(node.left == null && node.right == null)
        {
            s=s+node.val;
            List<String> list=new ArrayList<>();
            list.add(s);
            
            return list;
        }
        
        List<String> ans=new ArrayList<>();
        
        ans.addAll(find(node.left,s+node.val));
        ans.addAll(find(node.right,s+node.val));
        
        return ans;
    }
}