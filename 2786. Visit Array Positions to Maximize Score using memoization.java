class Solution {
    public long maxScore(int[] nums, int x) {
         long [][]dp=new long[nums.length][2];
          for(int i=0;i<dp.length;i++)
          {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
          }
        return nums[0]+path(nums,x,1,nums[0]%2==0?0:1,dp);
    }
    public static long path(int []nums,int x,int i,int check,long [][]dp)
    {
        if(i==nums.length)
        {
            return 0;
        }
        if(dp[i][check]!=-1)
        {
            return dp[i][check];
        }
        long xx=Long.MIN_VALUE;
        long yy=Long.MIN_VALUE;
        if(nums[i]%2==0)
        {
            if(check==0)
            {
                xx=nums[i]+path(nums,x,i+1,0,dp);
            }
            else
            {
                xx=nums[i]+path(nums,x,i+1,0,dp)-x;
            }
        }
        if(nums[i]%2!=0)
        {
            if(check==0)
            {
                xx=nums[i]+path(nums,x,i+1,1,dp)-x;
            }
            else
            {
                xx=nums[i]+path(nums,x,i+1,1,dp);
            }

        }
       yy=path(nums,x,i+1,check,dp);
       return dp[i][check]=Math.max(yy,xx);

    }
}