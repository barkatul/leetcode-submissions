class MinStack {
    
    Stack<Integer> s;
    Stack<Integer> ss;
    
    public MinStack() {
        s=new Stack<>();
        ss=new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        
        if(ss.isEmpty())
        {
            ss.push(val);
        }
        else
        {
            if(ss.peek()>=val)
                ss.push(val);
        }
        
    }
    
    public void pop() {
        if(s.peek().equals(ss.peek()))
        {
            ss.pop();
        }
        s.pop();
        
    }
    
    public int top() {
       return s.peek();
    }
    
    public int getMin() {
        return ss.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */