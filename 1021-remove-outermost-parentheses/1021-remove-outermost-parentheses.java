class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Integer> stack=new Stack<>();
        HashSet<Integer> set=new HashSet<>();
        
        char ch[]=s.toCharArray();
        
        int a=0;
        for(int i=0;i<ch.length;i++)
        {
            if(stack.isEmpty())
            {
                a=i;
            }
            char c=ch[i];
            
            if(c=='(')
            {
                stack.push(i);
            }
            else
            {
                if(ch[stack.peek()]=='(')
                {
                    a=stack.peek();
                    
                    stack.pop();
                    
                    if(stack.isEmpty())
                    {
                        set.add(a);
                        set.add(i);
                    }
                }
            }
        }
        s="";
        for(int i=0;i<ch.length;i++)
        {
            if(!set.contains(i))
            {
                s=s+ch[i];
            }
        }
        return s;
    }
}