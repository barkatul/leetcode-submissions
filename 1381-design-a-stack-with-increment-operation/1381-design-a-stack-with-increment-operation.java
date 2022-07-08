class CustomStack {
    
    Stack<Integer> s=new Stack<>();
    Stack<Integer> ss=new Stack<>();
    int size=0;
    int max;
    
    public CustomStack(int maxSize) {
        max=maxSize;
    }
    
    public void push(int x) {
        if(size==max)
            return;
        
        size++;
        s.push(x);
    }
    
    public int pop() {
        if(size==0)
            return -1;
        
        size--;
       return s.pop();
    }
    
    public void increment(int k, int val) {
        
        while(!s.isEmpty())
        {
            ss.push(s.pop());
        }
        
        while(k>0)
        {
            k--;
            
            if(ss.isEmpty())
            {
                break;
            }
            
            s.push(ss.pop()+val);
            
        }
        while(!ss.isEmpty())
        {
            s.push(ss.pop());
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */