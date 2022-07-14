class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] ans=new int[k];
        
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                list.add(nums[i]);
                map.put(nums[i],1);
            }
        }
        
        PriorityQueue<Integer> minH=new PriorityQueue<>();
        
        for(int i=0;i<list.size();i++)
        {
            minH.add(map.get(list.get(i)));
            
            if(minH.size()>k)
            {
                minH.poll();
            }
        }
        
        int a=0;
        for(int i=0;i<list.size();i++)
        {
            if(minH.contains(map.get(list.get(i))))
            {
                ans[a++]=list.get(i);
            }
        }
        
        return ans;
    }
}