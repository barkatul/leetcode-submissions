class Solution {

    static class Trip{
        int a;
        int b;
        
        double value;
        
        Trip(int a , int b){
            this.a=a;
            this.b=b;
            
            value=(double)(a)/(double)(b);
        }
    }
    
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
        int[] ans=new int[2];
        
        PriorityQueue<Trip> maxH=new PriorityQueue<>(Collections.reverseOrder(new Comparator<Trip>() {
            public int compare(Trip t1, Trip t2){
                
                if(t1.value >= t2.value){
                    return 1;
                }
                return -1;
            }
        }));
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                
                maxH.add(new Trip(arr[i], arr[j]));
                
                if(maxH.size()>k){
                    maxH.poll();
                }
            }
        }
        
        ans[0]=maxH.peek().a;
        ans[1]=maxH.peek().b;
        
        return ans;
    }
}