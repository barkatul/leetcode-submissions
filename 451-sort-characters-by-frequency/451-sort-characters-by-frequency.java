class Solution {
    class Pair{
        int key;
        char val;
        
        Pair(int key,char val){
            this.key=key;
            this.val=val;
        }
    }
    public String frequencySort(String s) {
        
        //we are treating minHeap as maxHeap by manipulating the comparator.
        
         PriorityQueue<Pair> maxH=new PriorityQueue<>(Collections.reverseOrder( new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.key == o2.key)
                {
                    if((int)o1.val > (int)o2.val)
                        return -1;

                    return 1;
                }
                else
                {
                    if(o1.key > o2.key)
                        return 1;

                    return -1;
                }
            }
        }));
        
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        
        
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i))){
                maxH.add(new Pair(map.get(s.charAt(i)),s.charAt(i)));
                map.remove(s.charAt(i));
            }
        }
        
        String ans="";
        
        while(!maxH.isEmpty()){
            int n=maxH.peek().key;
            char v=maxH.peek().val;
            
            maxH.poll();
            
           while(n>0){
               n--;
               ans=ans+v;
           }
        }
        
        return ans;
    }
}