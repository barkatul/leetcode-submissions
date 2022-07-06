class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stack=new Stack<>();
        int[] ans=new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--)
        {
            stack.push(nums[i]);
        }
        
        for(int i=nums.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                while(stack.peek() <= nums[i])
                {
                    stack.pop();
                    
                    if(stack.isEmpty())
                    {
                        ans[i]=-1;
                        break;
                    }
                }
                
                if(ans[i]!=-1)
                {
                    ans[i]=stack.peek();
                }
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}