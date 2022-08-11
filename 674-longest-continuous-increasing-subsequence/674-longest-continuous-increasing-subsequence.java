class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int max=1;
        
        int a=0;
        int b=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                
                max=Math.max(max,b-a+1);
                
                a=i;
                b=i;
            }
            else{
                b++;
            }
        }
        
        if(a==0){
            if(nums[a] == nums[nums.length-1])
                return 1;
            else{
                return nums.length;
            }
        }
        
        if(a!=nums.length-1){
            max=Math.max(max,nums.length -a);
        }
        
        return max;
    }
}