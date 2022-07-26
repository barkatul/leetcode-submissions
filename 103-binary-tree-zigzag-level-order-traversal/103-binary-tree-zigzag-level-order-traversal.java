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
    Queue<TreeNode> q=new LinkedList<>();
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root==null)
            return ans;
        
        q.add(root);
        boolean p=false;
        
        while(!q.isEmpty()){
            
            List<TreeNode> list=new ArrayList<>();
            
            while(!q.isEmpty()){
                list.add(q.poll());
            }
            
            List<Integer> l=new ArrayList<>();

            for(int i=0;i<list.size();i++){
                l.add(list.get(i).val);
                
                if(list.get(i).left != null)
                q.add(list.get(i).left);
                
                if(list.get(i).right != null)
                q.add(list.get(i).right);
            }
            
            if(p){
                Collections.reverse(l);
                p=false;
            }
            else{
                p=true;
            }
            
            ans.add(l);
        }
        return ans;
    }
}