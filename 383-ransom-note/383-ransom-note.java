class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<magazine.length();i++)
        {
            char c=magazine.charAt(i);
            
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch=ransomNote.charAt(i);
            
            if(!map.containsKey(ch))
            {
                return false;
            }
            else
            {
                if(map.get(ch)==0)
                    return false;
                else
                {
                    map.put(ch,map.get(ch)-1);
                }
            }
        }
        return true;
    }
}