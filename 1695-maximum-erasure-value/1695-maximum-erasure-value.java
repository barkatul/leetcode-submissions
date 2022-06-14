class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        if(nums.length==0)
            return nums[0];
        
        int sum=0;
        int maxsum=0;
        
        int a=0;
        int b=1;
        
        HashSet<Integer> set=new HashSet<>();
        set.add(nums[a]);
        sum=nums[a];
        maxsum=nums[a];
        
        while(b!=nums.length)
        {
            if(set.contains(nums[b]))
            {
                set.remove(nums[a]);
                sum=sum-nums[a];
                a++;
            }
            else
            {
                sum=sum+nums[b];
                maxsum=Math.max(maxsum,sum);
                set.add(nums[b]);
                b++;
            }
        }
        return maxsum;
    }
}