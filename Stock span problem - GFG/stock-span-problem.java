// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    
    static class Stock{
        int val;
        int index;
        
        Stock(int val,int index){
            this.val=val;
            this.index=index;
        }
    }
    
    static Stack<Stock> stack;
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        stack=new Stack<>();
        int[] ind=new int[n];
        
        boolean p=false;
        
        for(int i=0;i<n;i++)
        {
                while(!stack.isEmpty() && stack.peek().val <= price[i])
                {
                    stack.pop();
                }
                
                if(stack.isEmpty())
                {
                    ind[i]=-1;
                }
                else
                {
                    ind[i]=stack.peek().index;
                }
            
            stack.push(new Stock(price[i],i));
        }
        for(int i=0;i<n;i++)
        {
            ind[i]=i-ind[i];
        }
        return ind;
    }
    
}