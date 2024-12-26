class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int [][]dp=new int[nums.length][2000];
for(int i=0;i<dp.length;i++)
{
    for(int j=0;j<2000;j++)
    {
        
            dp[i][j]=Integer.MAX_VALUE;
      
    }
}
        return path(nums,target,0,0,dp);
      
        
        
    }
    public static int path(int []nums,int target,int i,int currsum,int [][]dp)
    {
       if(i==nums.length)
       {
         if(currsum==target)
         {
            return 1;
         }
         else
         {
                 return 0;
         }

   
       }
       if(dp[i][currsum+1000]!=Integer.MAX_VALUE)
       {
        return dp[i][currsum+1000];
       }
       int xx=path(nums,target,i+1,currsum+nums[i],dp);
       int yy=path(nums,target,i+1,currsum-nums[i],dp);
       return dp[i][currsum+1000]=xx+yy;
      
    }
}