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
    public List<Double> averageOfLevels(TreeNode root) {
       
        List<Double> list=new ArrayList<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            Long s=0l;
            int n=q.size();
            
            for(int i=0;i<n;i++){
                
                TreeNode cur=q.poll();
                
                s=s+cur.val;
                
                if(cur.left != null)
                    q.add(cur.left);
                
                if(cur.right != null)
                    q.add(cur.right);
                
            }
            
            list.add((double)(s)/(double)(n));
        }
        
        return list;
    }
    
    
}