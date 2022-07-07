class Solution {
    public int trap(int[] height) {
        
        int l=height.length;
        
        int[] A=new int[l];
        int[] B=new int[l];
        
        int max1=height[0];
        int max2=height[l-1];
        
        for(int i=0;i<l;i++)
        {
            max1=Math.max(max1,height[i]);
            max2=Math.max(max2,height[l-i-1]);
            
            A[i]=max1;
            B[l-i-1]=max2;
        }
        
        int sum=0;
        
        for(int i=0;i<l;i++)
        {
            sum=sum+Math.min(A[i],B[i])-height[i];
        }
        return sum;
    }
}