class RecentCounter {
    
    ArrayDeque<Integer> dq;
    int c=0;

    public RecentCounter() {
        
        dq=new ArrayDeque<>();
        
    }
    
    public int ping(int t) {
        
        while(!dq.isEmpty() && t-dq.peek() > 3000)
        {
            dq.pop();
            c--;
        }
        if(dq.isEmpty())
        {
            c++;
            dq.add(t);
            return 1;
        }
        else
        {
            c++;
            dq.add(t);
            return c;
        }
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */