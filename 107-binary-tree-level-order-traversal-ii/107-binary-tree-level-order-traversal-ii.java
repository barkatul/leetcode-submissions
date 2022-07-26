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
    
    Queue<TreeNode> q=new LinkedList<>();
    List<List<Integer>> fin= new ArrayList<>();
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        if(root == null)
            return fin;
        
        q.add(root);
        
        while(!q.isEmpty()){
            List<TreeNode> list=new ArrayList<>();
            
            while(!q.isEmpty()){
                list.add(q.poll());
            }
            
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                ans.add(list.get(i).val);
                
                if(list.get(i).left != null)
                {
                    q.add(list.get(i).left);
                }
                if(list.get(i).right != null)
                {
                    q.add(list.get(i).right);
                }
            }
            
            fin.add(ans);
    }
        Collections.reverse(fin);
        return fin;
    }
}