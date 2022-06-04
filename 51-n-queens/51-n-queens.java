class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        if(n==2 || n==3)
        {
            return ans;
        }
        if(n==1)
        {
            List<String> li=new ArrayList<>();
            li.add("Q");
            ans.add(li);
            return ans;
        }
        boolean[][] p=new boolean[n][n];
        solve(p,0,n,ans);
        return ans;
    }
    
    public void solve(boolean[][] p,int row,int n,List<List<String>> ans)
    {
        if(row==n)
        {
            display(p,ans);
            return;
        }
        
        for(int col=0;col<n;col++)
        {
            //checking if the place is safe or not
            if(isSafe(p,row,col,n))
            {
                //change
                p[row][col]=true;
                
                //recursive calls
                solve(p,row+1,n,ans);
                
                //change the changes
                //backtracking
                p[row][col]=false;
            }
        }
        
        return;
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
    
    public void display(boolean[][] p,List<List<String>> ans)
    {
        List<String> list=new ArrayList<>();
        String str="";
        for(int i=0;i<p.length;i++)
        {
            str="";
            for(int j=0;j<p.length;j++)
            {
                if(p[i][j])
                {
                    str=str+"Q";
                }
                else
                {
                    str=str+".";
                }
            }
            list.add(str);
        }
        ans.add(list);
    }
}