// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long[] left=NSL(hist);
        long[] right=NSR(hist);
        
        long max=0;
        for(int i=0;i<hist.length;i++)
        {
            max=Math.max(max,(left[i]+right[i]-1)*hist[i]);
        }
        
        return max;
    }
    
    public static long[] NSL(long arr[])
    {
        long[] ans=new long[arr.length];
        Stack<Integer> stack=new Stack<>();
        
        for(int i=0;i<arr.length;i++)
        {
            
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
            {
                stack.pop();
            }
            
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(i);
        }
        
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=i-ans[i];
        }
        return ans;
    }
    
    public static long[] NSR(long arr[])
    {
         long[] ans=new long[arr.length];
         Stack<Integer> stack=new Stack<>();
         
         for(int i=arr.length-1;i>=0;i--)
         {
             while(!stack.isEmpty() && arr[stack.peek()] >= arr[i])
             {
                 stack.pop();
             }
             if(stack.isEmpty()){
                ans[i]=arr.length;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(i);
         }
         
         for(int i=0;i<arr.length;i++)
         {
             ans[i]=ans[i]-i;
         }
         return ans;
    }
        
}



