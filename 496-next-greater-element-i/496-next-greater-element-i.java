class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans=new int[nums1.length];
        
         if(nums1.length==0)
        {
             return ans;
        }
        if(nums2.length==0)
        {
            for(int i=0;i<nums1.length;i++)
            {
                nums1[i]=-1;
            }
            return ans;
        }
        
        
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        
        boolean p=false;
        
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length-1;i++)
        {
            if(set.contains(nums2[i]))
            {
            for(int j=i+1;j<nums2.length;j++)
            {
                p=false;
                if(nums2[i]<nums2[j])
                {
                    p=true;
                    map.put(nums2[i],nums2[j]);
                    break;
                }
            }
            if(!p)
            {
                map.put(nums2[i],-1);
            }
            }
        }
        if(set.contains(nums2[nums2.length-1]))
        {
            map.put(nums2[nums2.length-1],-1);
        }
        
        for(int i=0;i<nums1.length;i++)
        {
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}