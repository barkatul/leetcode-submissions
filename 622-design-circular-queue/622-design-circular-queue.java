class MyCircularQueue {
    
    int[] arr;
    
    int front=0;
    int rear=0;
    
    int c=0;

    public MyCircularQueue(int k) {
        arr=new int[k];
    }
    
    public boolean enQueue(int value) {
        
        if(isFull())
            return false;
        
        arr[rear % arr.length]=value;
        c++;
        
            rear++;
        
        return true;
    }
    
    public boolean deQueue() {
        
        if(isEmpty())
            return false;
        
        arr[front % arr.length]=-1;
        c--;
        front++;
        
        return true;
        
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        return arr[front % arr.length];
    }
    
    public int Rear() {
        
        if(isEmpty())
            return -1;
        
        return arr[(rear-1)%arr.length];
    }
    
    public boolean isEmpty() {
        if(c==0)
            return true;
        return false;
    }
    
    public boolean isFull() {
        
        if(c==arr.length)
           return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */