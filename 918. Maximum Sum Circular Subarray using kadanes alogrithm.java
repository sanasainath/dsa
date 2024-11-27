class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            maxi=Math.max(maxi,sum);
            if(sum<0)
            {
                sum=0;
            }
        }
          int mini=Integer.MAX_VALUE;
        sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            mini=Math.min(mini,sum);
            if(sum>0)
            {
                sum=0;
            }
        }
        int total=0;
        for(int i:nums)
        {
            total+=i;
        }
        if(total==mini)
        {
            return maxi;
        }
        return Math.max(maxi,total-mini);
        
    }
}