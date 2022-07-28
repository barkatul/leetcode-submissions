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
    
    class Pair{
        TreeNode node;
        int ind;
        
        Pair(TreeNode node, int ind){
            this.node=node;
            this.ind=ind;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root == null)
            return 0;
        
        Queue<Pair> q=new LinkedList<>();
        
        int ans=1;
        int min=0;
        int max=0;
        int prev=0;
        
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            
            int n=q.size();
            
            for(int i=0;i<n;i++){
                
                if(i==0)
                {
                    min=q.peek().ind;
                }
                if(i==n-1){
                    max=q.peek().ind;
                }
                
                TreeNode curr=q.peek().node;
                int index=q.poll().ind;
                index=(index-prev);
                
                if(curr.left != null)
                    q.add(new Pair(curr.left, 2*index+1 ));
                    
                if(curr.right != null)
                    q.add(new Pair(curr.right, 2*index+2 ));
                
            }
            
            prev=min;
            ans=Math.max(ans, max-min +1);
        }
        return ans;
    }
}