class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack=new Stack<>();
        
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            
            if(stack.isEmpty() || stack.peek()!=c)
            {
                stack.push(c);
            }
            else
            {
                stack.pop();
            }
        }
        
        s="";
        
        while(!stack.isEmpty())
        {
            s=s+stack.pop();
        }
        return s;
    }
}