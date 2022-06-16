class Solution {
    public int maxScore(int[] cardPoints, int k) {
                
        int sum=0;
        
        for(int i=0;i<cardPoints.length;i++)
        {
            sum=sum+cardPoints[i];
        }
        
        if(k==cardPoints.length)
            return sum;
        
        int max=0, a=0, b=0, s=0;
        
        while(b<cardPoints.length-k)
        {
            s=s+cardPoints[b++];
        }
        
        max=Math.max(max,sum-s);
        
        while(b<cardPoints.length)
        {
            s=s-cardPoints[a++];
            s=s+cardPoints[b++];
            
            max=Math.max(max,sum-s);
        }
        return max;
    }
}