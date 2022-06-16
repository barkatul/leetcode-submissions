class Solution {
    public int minStartValue(int[] nums) {
        
        int start=1;
        
        if(nums[0]<0)
        {
            start=1-nums[0];
        }
        
        boolean p=false;
        while(!p)
        {
            int step=start;
            
            for(int i=0;i<nums.length;i++)
            {
                step=step+nums[i];
                
                if(step<1)
                {
                    start=start+1-step;
                    break;
                }
                if(i==nums.length-1)
                {
                    p=true;
                }
            }
        }
        return start;
    }
}