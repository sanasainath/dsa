class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
      if (n <= 1) {
        return false; // Handle cases where nums has insufficient elements
    }
        int sum=0;
         boolean x=false;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];

        }
          boolean [][]dp=new boolean [n][sum/2+1];
          for(int u=0;u<n;u++)
          {
              dp[u][0]=true;
          }
          if(nums[0]==sum/2)
          {
 dp[0][nums[0]]=true;
          }

          
         
        if(sum%2==0)
        {
            for(int q=1;q<n;q++)
            {
                for(int tar=1;tar<=sum/2;tar++ )
                {
                   boolean g=dp[q-1][tar];
                   boolean h=false;
                   if(tar>=nums[q])
                   {
                       h=dp[q-1][tar-nums[q]];
                   }
                   dp[q][tar]=g||h;
                }
            }
        // x=path(nums,n-1,sum/2,dp);
        return dp[n-1][sum/2];


        }
        return false;
        
    }
    // public static boolean path(int []nums,int n,int target,boolean [][]dp)
    // {
    //     if(target==0)
    //     {
    //         return true;
    //     }
    //     if(n==0)
    //     {
    //         return  nums[0]==target;
    //     }
    //     if(dp[n][target])
    //     {
    //         return true;
    //     }
    //     boolean nottaken=path(nums,n-1,target,dp);
    //     boolean took=false;
    //     if(target>=nums[n])
    //     {
    //             took=path(nums,n-1,target-nums[n],dp);
    //     }
    //     return dp[n][target]=took||nottaken;

    // }
}