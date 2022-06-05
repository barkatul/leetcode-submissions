class Solution {
    public int totalNQueens(int n) {
        if(n==1)
            return 1;
        if(n==2 || n==3)
            return 0;
        boolean[][] p=new boolean[n][n];
        return solve(p,0,n);
    }
    public int solve(boolean[][] p,int row,int n)
    {
        if(row==n)
        {
            return 1;
        }
        int count=0;
        
        for(int col=0;col<n;col++)
        {
            if(isSafe(p,row,col,n))
            {
                p[row][col]=true;
                
                count=count+solve(p,row+1,n);
                
                p[row][col]=false;
            }
        }
        return count;
    }
     public boolean isSafe(boolean[][] p,int r,int c,int n)
    {
        //chacking that col
        for(int i=0;i<r;i++)
        {
            if(p[i][c])
            {
                return false;
            }
        }
        
        //checking right diagonal
        int a=r-1;
        int b=c+1;
        
        while(a>=0 && b<n)
        {
            if(p[a][b])
                return false;
            a--;
            b++;
        }
        
        //checking right diagonal
        a=r-1;
        b=c-1;
        
        while(a>=0 && b>=0)
        {
            if(p[a][b])
                return false;
            a--;
            b--;
        }
        
        return true;
        
    }
}