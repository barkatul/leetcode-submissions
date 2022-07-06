class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        Stack<Integer> stack=new Stack<>();
        
        int[] ans=new int[nums1.length];
        boolean p=false;
        
        for(int i=nums2.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                map.put(nums2[i],-1);
                stack.push(nums2[i]);
            }
            else
            {
                while(stack.peek() <= nums2[i])
                {
                    stack.pop();
                    
                    if(stack.isEmpty())
                    {
                        p=true;
                        break;
                    }
                }
                if(p)
                {
                    p=false;
                    map.put(nums2[i],-1);
                    stack.push(nums2[i]);
                }
                else
                {
                   map.put(nums2[i],stack.peek()); 
                   stack.push(nums2[i]);
                }
            }
        }
        
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=map.get(nums1[i]);
        }
        
        return ans;
    }
}