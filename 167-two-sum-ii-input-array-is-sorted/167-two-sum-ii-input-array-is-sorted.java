class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int ans[]=new int[2];
        
        if(numbers.length==2)
        {
            ans[0]=1;
            ans[1]=2;
            
            return ans;
        }
        
        for(int i=0;i<numbers.length;i++)
        {
            
            int start=0;
            int end=numbers.length-1;
            
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                
                if(numbers[mid] + numbers[i]== target && i!=mid)
                {

                    if(i > mid)
                    {
                        ans[0]=mid+1;
                        ans[1]=i+1;
                    }
                    else
                    {
                        ans[0]=i+1;
                        ans[1]=mid+1;
                    }
                    return ans;
                }
                
                if(numbers[mid] + numbers[i] > target)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}