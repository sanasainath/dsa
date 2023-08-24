class MyQueue {
  Stack<Integer>q=new Stack<>();
   Stack<Integer>q1=new Stack<>();
  
    public MyQueue() {
        
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q1.isEmpty())
        {
       
           while(!q.isEmpty())
           {
               q1.add(q.peek());
               q.pop();
           }
        }
        int x=q1.peek();
        q1.pop();
        return x;
    }
    
    public int peek() {
         if(q1.isEmpty())
        {
       
           while(!q.isEmpty())
           {
               q1.add(q.peek());
               q.pop();
           }
        }
        return q1.peek();
    }
    
    public boolean empty() {
  return q.isEmpty()&&q1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */