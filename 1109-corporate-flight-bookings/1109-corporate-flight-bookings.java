class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int[] ans=new int[n];
        
        for(int i=0;i<bookings.length;i++)
        {
            int f=bookings[i][0];
            int l=bookings[i][1];
            
            int s=bookings[i][2];
            
            for(int j=f;j<=l;j++)
            {
                ans[j-1]=ans[j-1]+s;
            }
        }
        
        return ans;
    }
}