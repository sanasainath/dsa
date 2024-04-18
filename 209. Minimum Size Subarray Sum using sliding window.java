class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int sum=0;
        int left=0;
        int maxi=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            while(sum>=target)
            {
                  maxi=Math.min(maxi,i-left+1);
                sum-=nums[left];
              
                left++;
                
            }
        }
        return maxi==Integer.MAX_VALUE?0:maxi;
        
    }
}