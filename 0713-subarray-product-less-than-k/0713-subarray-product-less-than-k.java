class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if(k<=1)
            return 0;
        
        int c=0;
        int i=0,j=0;
        int p=1;
        
        p=p*nums[i];
        
        if(p<k)
        {
            c++;
        }
        j++;
        
        while(j<nums.length)
        {
            p=p*nums[j];
            
            
            if(p<k)
            {
                c=c+(j-i+1);
                j++;
            }
            else if(p>=k)
            {
                while(p>=k)
                {
                    p=p/nums[i];
                    i++;
                }
                c=c+(j-i+1);
                j++;
            }
        }
        return c;
    }
}