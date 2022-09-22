class Solution {
    public String reverseWords(String s) {
        String[] S=s.split(" ");
        
        for(int i=0;i<S.length;i++)
        {
            S[i]=reverse(S[i]);
        }
        String str="";
        
        for(int i=0;i<S.length;i++)
        {
            str=str+S[i]+" ";
        }
        str=str.trim();
        return str;
    }
    private String reverse(String s)
    {
        
        String str="";
        
        for(int i=s.length()-1;i>=0;i--)
        {
            str=str+s.charAt(i);
        }
        return str;
    }
}