class Solution {
    public int largestRectangleArea(int[] heights) {
    int n=heights.length;
    Stack<Integer>st=new Stack<>();
   
    int arr[]=new int [n];
   
   
    for(int i=n-1;i>=0;i--)
    {
        while(!st.isEmpty()&&heights[st.peek()]>=heights[i])
        {
            st.pop();
            
        }
        if(st.isEmpty())
        {
            arr[i]= n-1;
        }
        else
        {
            arr[i]=st.peek()-1;

        }
        
        st.push(i);
        
    }
    while (!st.isEmpty()) {
    st.pop();
}

    int arr1[]=new int[n];
    for(int k=0;k<n;k++)
    {
        while(!st.isEmpty()&&heights[st.peek()]>=heights[k])
        {
            st.pop();
        }
        if(st.isEmpty())
        {
            arr1[k]=0;
        }
        else
        {
            arr1[k]=st.peek()+1;
        }
        st.push(k);
    }
    int maxi=0;
  
   for(int j=0;j<n;j++)
{
    

   
    maxi = Math.max(maxi, heights[j]*(arr[j]-arr1[j]+1));
}

    return maxi;        
    }
}