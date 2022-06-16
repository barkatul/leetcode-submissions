class Solution {
    public int pivotIndex(int[] nums) {
        
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            left[i]=s;
            s=s+nums[i];
        }
        s=0;
        
        for(int i=nums.length-1;i>=0;i--)
        {
            right[i]=s;
            s=s+nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(left[i]==right[i])
                return i;
        }
        return -1;
    }
}