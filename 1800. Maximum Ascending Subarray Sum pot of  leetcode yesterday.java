class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>0&&nums[i-1]>=nums[i])
            {
                maxi=Math.max(maxi,sum);
                sum=0;
            }
         sum+=nums[i];

        }
        maxi=Math.max(maxi,sum);
        return maxi;
        
    }
}