class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int maxi=0;
        int zeroes=0;
        
        for(int right=0;right<n;right++)
        {
            if(nums[right]==0)
            {
                zeroes++;
            }
            while(zeroes>k)
            {
                if(nums[left]==0)
                {
                    zeroes--;
                 
                }
                   left++;

               

            }
            maxi=Math.max(maxi,right-left+1);

        }
        return maxi;
        
    }
}