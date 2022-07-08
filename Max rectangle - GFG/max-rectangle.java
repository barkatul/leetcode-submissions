// { Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int M[][], int n, int m) {
        // add code here.
        
        int[] arr=new int[m];
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(M[i][j]==0)
                {
                    arr[j]=0;
                }
                else
                {
                    arr[j]=arr[j]+1;
                }
            }
            max=Math.max(max,MAH(arr));
        }
        
        return max;
    }
    public static int MAH(int arr[])
    {
        int[] left=NSL(arr);
        int[] right=NSR(arr);
        
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,(left[i]+right[i]-1)*arr[i]);
        }
        
        return max;
    }
    
    
    public static int[] NSL(int arr[])
    {
        int[] ans=new int[arr.length];
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
    
    public static int[] NSR(int arr[])
    {
         int[] ans=new int[arr.length];
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