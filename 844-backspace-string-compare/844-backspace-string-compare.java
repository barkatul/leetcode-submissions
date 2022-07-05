class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            
            if(c=='#')
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        s="";
        while(!stack.isEmpty())
        {
            s=s+stack.pop();
        }
        
         for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            
            if(c=='#')
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        t="";
        while(!stack.isEmpty())
        {
            t=t+stack.pop();
        }
        
        return s.equals(t);
    }
}