class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (o1,o2)->o1[0]-o2[0]);
        
        List<Integer> list = new ArrayList<>();
        list.add(intervals[0][0]);
        
        int end=0;
        
        for(int i=0;i<intervals.length-1;i++)
        {
            end = Math.max(end,intervals[i][1]);
                
            if( end >= intervals[i+1][0])
            {
                continue;
            }
            else
            {
                list.add(end);
                list.add(intervals[i+1][0]);
            }
        }
        if(end < intervals[intervals.length-1][1])
        list.add(intervals[intervals.length-1][1]);
        
        else
            list.add(end);
        
        int[][] ans=new int[list.size()/2][2];
        int a=0;
        
        for(int i=0;i<list.size();i++)
        {
            if(i%2==0)
            {
                ans[a][0]=list.get(i);
            }
            else
            {
                ans[a++][1]=list.get(i);
            }
        }
        return ans;
        
    }
}