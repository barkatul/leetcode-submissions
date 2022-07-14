class Solution {
    class Pair{
        
        int key;
        int val;
        
        Pair(int key, int val){
            this.key=key;
            this.val=val;
        }
        
    }
    public int[][] kClosest(int[][] points, int k) {
        
        int[][] ans=new int[k][2];
        
        PriorityQueue<Pair> maxH=new PriorityQueue<>(Collections.reverseOrder(new Comparator<Pair>() {
            public int compare(Pair o1, Pair o2){
                if(o1.key >= o2.key){
                    return 1;
                }
                return -1;
            }
        }));
        
        for(int i=0;i<points.length;i++){
                
            maxH.add(new Pair(points[i][0]*points[i][0] + points[i][1]*points[i][1] , i ));
            
            if(maxH.size() > k){
                maxH.poll();
            }
        }
        
        int a=0;
        while(!maxH.isEmpty()){
            
            int c=maxH.peek().val;
            
            ans[a][0]=points[c][0];
            ans[a][1]=points[c][1];
            
            a++;
            maxH.poll();
        }
        
        return ans;
    }
}