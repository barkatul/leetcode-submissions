class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list=new ArrayList<>();
        String str="";
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i==s.length()-1)
            {
                str=ch+str;
                list.add(str);
                str="";
            }
            else
            {
                if(ch==' ')
                {
                    list.add(str);
                    str="";
                }
                else
                {
                   str=ch+str;
                }
            }
        }
        for(int i=0;i<list.size();i++)
        {
            if(i!=list.size()-1)
            {
                str=str+list.get(i)+" ";
            }
            else
            {
                str=str+list.get(i);
            }
        }
        return str;
    }
}