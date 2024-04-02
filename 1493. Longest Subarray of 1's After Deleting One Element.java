class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int left=0;
        int maxi=0;
        int count=0;
        for(int right=0;right<n;right++)
        {
            if(nums[right]==0)
            {
                count++;

            }
            while(count>1)
            {
               if(nums[left]==0)
               {
                count--;
               }
               left++;
            }
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi-1;
        
    }
}