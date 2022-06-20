class Solution {
    public int divisorSubstrings(int num, int k) {
        
        int c=0;
        String s=String.valueOf(num);
        
        int a=0;
        int b=k-1;
        
        while(b<s.length())
        {
            int n=Integer.parseInt(s.substring(a,b+1));
            
            if(n!=0)
            {
                if(num%n==0)
                {
                    c++;
                }
            }
            
            a++;
            b++;
        }
        
        return c;
    }
}