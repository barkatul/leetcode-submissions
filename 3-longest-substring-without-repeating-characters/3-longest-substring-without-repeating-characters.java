class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        if(s.length()==1)
            return 1;
        
        int a=0;
        int b=0;
        
        int c=0;
        int max=1;
        
        HashSet<Character> set=new HashSet<>(); 
        
        while(b<s.length())
        {
            if(!set.contains(s.charAt(b)))
            {   
                set.add(s.charAt(b));
                b++;
                max=Math.max(max,b-a);
            }
            else
            {
                boolean p=false;
                
                while(set.contains(s.charAt(b))){
                
                    set.remove(s.charAt(a));
                    a++;
                    
                    if(a==b)
                    {
                        p=true;
                        b++;
                        break;
                    }
                }
                if(p)
                {
                set.add(s.charAt(b-1));
                }
            }
        }
        return max;
    }
}