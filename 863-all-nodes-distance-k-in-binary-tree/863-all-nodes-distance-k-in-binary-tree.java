/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        HashMap<TreeNode,Boolean> visited=new HashMap<>();
        
        List<Integer> list=new ArrayList<>();
        
        parent_pointer(root,parent);
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        visited.put(target,true);
        
        int level=0;
        
        while(!q.isEmpty()){
            
            if(level == k)
                break;
            
            level++;
            
            int n=q.size();
            
            for(int i=0;i<n;i++){
                TreeNode cur=q.poll();
                
                if(cur.left!=null && visited.get(cur.left) == null){
                    
                
                    q.offer(cur.left);
                    visited.put(cur.left,true);
                    
                }
                if(cur.right!=null && visited.get(cur.right) == null){
                    
                
                    q.offer(cur.right);
                    visited.put(cur.right,true);
                }
                if(parent.get(cur)!=null && visited.get(parent.get(cur)) == null){
                    
                    
                    q.offer(parent.get(cur));
                    visited.put(parent.get(cur),true);
                }
            }
        }
        while(!q.isEmpty()){
            list.add(q.poll().val);
        }
        return list;
        
    }
    
    private void parent_pointer(TreeNode root,Map<TreeNode,TreeNode> map){
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
                
                TreeNode cur=q.poll();
                
                if(cur.left != null)
                {
                    q.offer(cur.left);
                    map.put(cur.left,cur);
                }
                if(cur.right != null)
                {
                    q.offer(cur.right);
                    map.put(cur.right,cur);
                }
        }
        
    }
}