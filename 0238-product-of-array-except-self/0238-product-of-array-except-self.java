class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int mul=1;
        
        int z=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                z++;
                continue;
            }
            mul=mul*nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(z==1)
            {
                if(nums[i]==0)
                {
                    nums[i]=mul;
                }
                else
                {
                    nums[i]=0;
                }
            }
            else
            if(z>1)
            {
                nums[i]=0;
            }
            else
            {
                nums[i]=mul/nums[i];
            }
        }
        return nums;
    }
}