class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length;
      int[] a = new int[n];
int even=0;int odd=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
              a[odd]=nums[i];
              odd=odd+2;
            }
            else
            {
                a[even]=nums[i];
                even=even+2;
            }
        }
        return a;
    }
}