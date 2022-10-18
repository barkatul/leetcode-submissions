class Solution {
    public String countAndSay(int n) {
        
        String ans="1";
        
        if(n==1)
            return ans;
        
        
        while(n>1)
        {
            n--;
            ans=count(ans);
        }
        
        return ans;
    }
    public String count(String str){
        
        String s="";
        
        int c=1;
        char ch='0';
        
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            
            if(i!=str.length()-1){
                
                if(ch==str.charAt(i+1))
                    c++;
                
                else{
                    s=s+c+ch;
                    c=1;
                }
            }
            else
            {
                    s=s+c+ch;
            }
        }
        return s;
    }
}