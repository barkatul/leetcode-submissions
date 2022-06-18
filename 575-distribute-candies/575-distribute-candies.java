class Solution {
    public int distributeCandies(int[] candyType) {
        
        Arrays.sort(candyType);
        
        int c=0;
        
        for(int i=0;i<candyType.length;i++)
        {
            if(i!=candyType.length-1)
            {
            while(candyType[i] == candyType[i+1])
            {
                i++;
                if(i==candyType.length-1)
                    break;
            }
            }
            c++;
        }
        return Math.min(candyType.length/2,c);
    }
}