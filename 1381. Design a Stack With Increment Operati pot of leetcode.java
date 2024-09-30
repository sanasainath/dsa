class CustomStack {
    int n;
    Stack<Integer>st;
    int count=0;

    public CustomStack(int maxSize) {
        n=maxSize;
        st=new Stack<>();
        
    }

    
    public void push(int x) {
        if(count<n)
        {
            st.push(x);
            count++;

        }
        
    }
    
    public int pop() {
        if(!st.isEmpty())
        {
            count--;
            return st.pop();
        }
        return -1;
        
    }
    
    public void increment(int k, int val) {
        int x=k;
        Stack<Integer>s=new Stack<>();

        while(!st.isEmpty())
        {
            int y=st.pop();
            s.push(y);
            

        }
        while(x>0&&!s.isEmpty())
        {
            st.push(s.pop()+val);

            x--;
        }
        while(!s.isEmpty())
        {
            st.push(s.pop());
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
