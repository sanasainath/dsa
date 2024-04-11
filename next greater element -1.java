class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Stack<Integer>st=new Stack<>();
      HashMap<Integer,Integer>mapp=new HashMap<>();
      for(int i=nums2.length-1;i>=0;i--)
      {
       
        while(!st.isEmpty()&&st.peek()<nums2[i])
        {
           
            st.pop();

        }
         if(st.isEmpty())
        {
            mapp.put(nums2[i],-1);
        }
        else
        {
             mapp.put(nums2[i],st.peek());
        }
       
        st.push(nums2[i]);
      }
      int arr[]=new int[nums1.length];
      for(int j=0;j<nums1.length;j++)
      {
        if(mapp.containsKey(nums1[j]))
        {
            arr[j]=mapp.get(nums1[j]);

        }
      }
      return arr;
    }
}