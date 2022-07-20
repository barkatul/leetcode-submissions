class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> maxH=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                
                maxH.add(matrix[i][j]);
                
                if(maxH.size() > k){
                    maxH.poll();
                }
            }
        }
        return maxH.peek();
    }
}