class Solution {
    public double myPow(double x, int n) {
        
        boolean neg=false;
        if(x<0)
        {
            if(n%2!=0)
            neg=true;
            
            x=Math.abs(x);
        }
        
        boolean rec=false;
        if(n<0)
        {
            n=Math.abs(n);
            rec=true;
        }
        
        double ans=Pow(x,n);
        
        if(rec)
        {
            ans=1.0/ans;
        }
        if(neg)
        {
            ans=0.0-ans;
        }
        
        return ans;
        
    }
    
    private double Pow(double x,int n)
    {
        if(n==0)
            return 1.0;
        if(n==1)
            return x;
        
        double R = Pow(x,n/2);
        
        if((n&1)==0)
        {
            return R*R;
        }
        else
        {
            return R*R*x;
        }
    }
}