class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans=new int[nums.length];
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2 == 0)
            {
                sum=sum+nums[i];
            }
        }
        
        for(int i=0;i<queries.length;i++)
        {
            int ind=queries[i][1];
            
            if(nums[ind]%2 == 0)
            {
                if(queries[i][0]%2 == 0)
                {
                    sum=sum+queries[i][0];
                }
                else
                {
                    sum=sum-nums[ind];
                }
            }
            else
            {
                if(queries[i][0]%2 != 0)
                {
                    sum=sum+nums[ind]+queries[i][0];
                }
            }
            nums[ind]=nums[ind]+queries[i][0];
            ans[i]=sum;
        }
        return ans;
    }
}