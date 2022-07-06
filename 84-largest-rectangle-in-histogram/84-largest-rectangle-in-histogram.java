class Solution {
    
    class Height{
        
        int val;
        int ind;
        
        Height(int val, int ind){
            this.val=val;
            this.ind=ind;
        }
    }
    
    Stack<Height> stack;
    
    public int largestRectangleArea(int[] heights) {
        
        if(heights.length==1)
        {
            return heights[0];
        }
        
        int a=heights.length;
        
        stack=new Stack<>();
        
        int[] l=new int[heights.length];
        int[] r=new int[heights.length];
        
        for(int i=0;i<heights.length;i++)
        {
            while(!stack.isEmpty() && stack.peek().val >= heights[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                l[i]=i+1;
            }
            else
            {
                l[i]=i-stack.peek().ind;
            }
            stack.push(new Height(heights[i],i));
        }
        
        while(!stack.isEmpty())
        {
            stack.pop();
        }
        
         for(int i=heights.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && stack.peek().val >= heights[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                r[i]=a-i-1;
            }
            else
            {
                r[i]=stack.peek().ind-i-1;
            }
            stack.push(new Height(heights[i],i));
        }
        
        int max=0;
        
        for(int i=0;i<heights.length;i++)
        {
            if(max < (l[i]*heights[i]) + (r[i]*heights[i]) )
            {
                max = (l[i]*heights[i]) + (r[i]*heights[i]);
            }
        }
        return max;
    }
}