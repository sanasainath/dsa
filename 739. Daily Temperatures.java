class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int arr[]=new int[n];
        Stack<Integer>st=new Stack<>();
        
        for(int i=n-1;i>=0;i--)
        {
            
             while(!st.isEmpty()&&temperatures[st.peek()]<=temperatures[i])
             {
                
                st.pop();
                
             }

             if(st.isEmpty())
             {
                arr[i]=0;
             }
             else
             {
                arr[i]=st.peek()-i;
             }
              
              

             st.push(i);
        }
        return arr;
    }
}