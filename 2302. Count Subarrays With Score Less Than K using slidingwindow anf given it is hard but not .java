class Solution {
    public long countSubarrays(int[] nums, long k) {
        long res=0;
      int left=0;
      int right=0;
      long count=0;
      while(right<nums.length)
      {
         count+=nums[right];
         while(count*(right-left+1)>=k)
         {
            count-=nums[left];
            left++;
         }
        

        res+=(right-left+1);
        right++;
      }
      return res;

        
        
    }
}