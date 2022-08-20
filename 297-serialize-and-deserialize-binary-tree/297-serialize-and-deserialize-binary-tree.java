/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        if(root == null)
            return "#";
        
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            TreeNode node=q.poll();
            
            if(node == null)
                sb.append("#").append(" ");
                
            else
            {
                sb.append(node.val+"").append(" ");
                
                q.offer(node.left);
                q.offer(node.right);
                
            }
        }
        
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        String[] arr = data.split(" ");
        
        if(arr[0] == "#")
            return null;
        
        
        TreeNode root=new TreeNode(Integer.parseInt(arr[0]));
        
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        
        int i=1;
       
        while(!q.isEmpty()){
            
           TreeNode h = q.poll();
            if (h != null) {
            TreeNode left = null;
            if (!arr[i].equals("#")) {
                left = new TreeNode(Integer.parseInt(arr[i]));
            }
            h.left = left;
            q.offer(left);
            i++;
 
            TreeNode right = null;
            if (!arr[i].equals("#")) {
                right = new TreeNode(Integer.parseInt(arr[i]));
            }
            h.right = right;
            q.offer(right);
            i++;
            }
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));