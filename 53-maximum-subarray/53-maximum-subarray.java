class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        boolean p=false;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++)
        {
            max=Math.max(nums[j],max);
            if(nums[j]>=0)
                p=true;
            if(p)
                break;
        }
        if(!p)
        {
            return max;
        }
        int maxsum=0;
        int sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            
            if(sum>maxsum)
                maxsum=sum;
            
            if(sum<=0)
            {
                sum=0;
            }
        }
        return maxsum;
    }
}