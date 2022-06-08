class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0)
            return;
        int s1=0;
        int s2=0;
        for(int i=0;i<(m+n);i++)
        {
            if(nums1[s1]==0 && i>=m)
            {
                nums1[s1]=nums2[s2];
                s1++;
                s2++;
                continue;
            }
            if(nums1[s1]<=nums2[s2])
            {
                s1++;
            }
            else
            {
                int temp=nums2[s2];
                nums2[s2]=nums1[s1];
                nums1[s1]=temp;
                Arrays.sort(nums2);
                s1++;
            }
        }
    }
}