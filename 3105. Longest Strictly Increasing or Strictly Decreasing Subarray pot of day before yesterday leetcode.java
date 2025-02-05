class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(i>0&&nums[i-1]>=nums[i])
            {
                maxi=Math.max(maxi,count);
                count=0;
            }
            count++;
        }
        maxi=Math.max(count,maxi);
        count=0;
         for(int i=0;i<nums.length;i++)
        {
            if(i>0&&nums[i-1]<=nums[i])
            {
                maxi=Math.max(maxi,count);
                count=0;
            }
            count++;
        }
          maxi=Math.max(count,maxi);
          return maxi;
        
        
    }
}