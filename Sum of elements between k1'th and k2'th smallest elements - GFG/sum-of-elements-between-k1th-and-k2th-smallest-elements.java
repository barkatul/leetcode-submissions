// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            StringTokenizer stt = new StringTokenizer(br.readLine());
            long k1 = Long.parseLong(stt.nextToken());
            long k2 = Long.parseLong(stt.nextToken());
            
            Solution obj = new Solution();
            System.out.println( obj.sumBetweenTwoKth(a, n, k1, k2) );
            
        }
	}
}// } Driver Code Ends


//User function Template for Java


class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        // Your code goes her
        long a=kth(A,K1);
        long b=kth(A,K2);
        
        long sum=0;
        
        for(int i=0;i<N;i++){
            if(A[i]>a && A[i]<b)
            {
                sum=sum+A[i];
            }
        }
        return sum;
    }
    
    public static long kth(long A[], long k){
        
        PriorityQueue<Long> maxH=new PriorityQueue<>(Collections.reverseOrder());
        
        for(long n:A){
            maxH.add(n);
            
            if(maxH.size()>k)
            maxH.poll();
        }
        
        return maxH.peek();
    }
}
