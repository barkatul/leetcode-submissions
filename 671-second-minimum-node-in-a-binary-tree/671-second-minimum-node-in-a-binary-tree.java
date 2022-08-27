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
    
    public int findSecondMinimumValue(TreeNode root) {
        
        List<Integer> list=new ArrayList<>();
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            int n=q.size();
            
            for(int i=0;i<n;i++){
                
                TreeNode curr=q.poll();
                
                if(!list.contains(curr.val))
                list.add(curr.val);
                
                if(curr.left != null)
                    q.add(curr.left);
                
                if(curr.right != null)
                    q.add(curr.right);
                
            }
        }
        
        Collections.sort(list);
        
        if(list.size()<2)
            return -1;
        
        return list.get(1);
    }
}