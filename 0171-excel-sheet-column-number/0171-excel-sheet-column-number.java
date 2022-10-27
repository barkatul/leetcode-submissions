class Solution {
    public int titleToNumber(String columnTitle) {
        
        int ans=0;
        
        int c=0;
        
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            int sum=columnTitle.charAt(i)-'A'+1;
            
            ans=ans+sum*(int)(Math.pow(26,c++));
        }
        return ans;
    }
}