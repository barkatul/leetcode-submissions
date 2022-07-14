class Solution {
    
    class Pair{
        int key;
        int val;
        
        Pair(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    public int[] frequencySort(int[] nums) {
       
       PriorityQueue<Pair> minH=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.key == o2.key)
                {
                    if(o1.val > o2.val)
                        return -1;

                    return 1;
                }
                else
                {
                    if(o1.key < o2.key)
                        return -1;

                    return 1;
                }
            }
        });
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i])){
                minH.add(new Pair(map.get(nums[i]),nums[i]));
                map.remove(nums[i]);
            }
        }
        int a=0;
        while(!minH.isEmpty()){
            int n=minH.peek().key;
            int v=minH.poll().val;
            
           while(n>0){
               n--;
               nums[a++]=v;
           }
        }
        
        return nums;
    }
}