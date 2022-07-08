class CustomStack {
    
    int arr[];
    int count=0;

    public CustomStack(int maxSize) {
        arr=new int[maxSize];
    }
    
    public void push(int x) {
        if(count==arr.length)
            return;
        arr[count++]=x;
    }
    
    public int pop() {
        if(count==0)
            return -1;
        
        count--;
        int temp=arr[count];
        arr[count]=0;
        
        return temp;
    }
    
    public void increment(int k, int val) {
        
        for(int i=0;i<k;i++)
        {
            if(i==count)
                break;
            
            arr[i]=arr[i]+val;
            
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