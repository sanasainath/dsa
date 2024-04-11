class Solution {
    public int[] nextGreaterElements(int[] nums) {
    
    int []arr=new int[nums.length];
    Arrays.fill(arr,-1);
    Stack<Integer>st=new Stack<>();
    for(int i=0;i<2*nums.length;i++)
    {
        int x=nums[i%nums.length];
     
         while(!st.isEmpty()&&nums[st.peek()]<x)
        {
            arr[st.pop()]=x;

        }
        
        
         if(i<nums.length)
         {
            st.push(i);
         }
    
        
        


    }
    
    
    return arr;
        

        
    }
}