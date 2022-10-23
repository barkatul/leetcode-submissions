class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans=new int[2];
        int i=0;
        while(i<nums.length)
        {
            int correct=nums[i]-1;
            
            if(nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }
            else
                i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if(j+1!=nums[j])
            {
                ans[0]=nums[j];
                ans[1]=j+1;
                break;
            }
            
        }
        return ans;
    }
    public void swap(int A[], int a, int b)
    {
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
}