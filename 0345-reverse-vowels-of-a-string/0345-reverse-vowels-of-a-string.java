class Solution {
    public String reverseVowels(String s) {
        if(s.length()==1)
            return s;
        
        int i=0;
        int j=s.length()-1;
        
        while(i<j)
        {
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            
            
            if(c1!='a'&&c1!='e'&&c1!='i'&&c1!='o'&&c1!='u'&&c1!='A'&&c1!='E'&&c1!='I'&&c1!='O'&&c1!='U')
            {
                i++;
                continue;
            }
            
            if(c2!='a'&&c2!='e'&&c2!='i'&&c2!='o'&&c2!='u'&&c2!='A'&&c2!='E'&&c2!='I'&&c2!='O'&&c2!='U')
            {
                j--;
                continue;
            }
            
            s=s.substring(0,i)+c2+s.substring(i+1,j)+c1+s.substring(j+1);
            i++;
            j--;
        }
        return s;
    }
}