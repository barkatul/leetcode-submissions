class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        
        if(s.length()<=10)
            return list;
        
        int i=0,j=0;
        String str="";
        
        while(j<s.length())
        {
            //calculation
            str=str+s.charAt(j);
            
            if(j-i+1 < 10)
            {
                j++;
            }
            else if(j-i+1 == 10)
            {
                //answer
                if(map.containsKey(str))
                {
                    if(!list.contains(str))
                    list.add(str);
                    
                    map.put(str,map.get(str)+1);
                }
                else
                {
                    map.put(str,1);
                }
                
                //slide
                str=str.substring(1);
                i++;
                j++;
            }
        }
        
        return list;
    }
}