class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
                
        int a=0;
        int b=0;
        Stack<Integer> stack=new Stack<>();
        
        
        while(a!=pushed.length || b!=popped.length)
        {
            if(stack.isEmpty())
            {
                stack.push(pushed[a++]);
            }
            
            while(stack.peek()!=popped[b])
            {
                if(a==pushed.length)
                    return false;
                
                stack.push(pushed[a]);
                a++;
            }
            
            stack.pop();
            b++;
        }
        
        return true;
    }
}