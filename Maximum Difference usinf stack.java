
class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int []first=new int[n];
        int []last=new int[n];
         for (int i = 0; i < n; i++) {
            first[i] = 0;
            last[i] = 0;
        }
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            while(!st.isEmpty()&&st.peek()>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty()){
            first[i]=st.peek();
            }
            st.push(arr[i]);
            
            
        }
        
        st.clear();
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
              while(!st.isEmpty()&&st.peek()>=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty()){
            last[i]=st.peek();
            }
            st.push(arr[i]);
            
            
        }
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            int xx=Math.abs(first[i]-last[i]);
            {
                if(xx>maxi)
                {
                    maxi=xx;
                }
            }
            
        }
        return maxi;
    }
}