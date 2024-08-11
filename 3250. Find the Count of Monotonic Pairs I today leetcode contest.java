class Solution {
    private static int mod=1000000007;
    public int countOfPairs(int[] nums) {
        int n=nums.length;
        int [][][]dp=new int[n+1][51][51];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<51;j++)
            {
                for(int k=0;k<51;k++)
                {
                    dp[i][j][k]=-1;
                }
            }
        }
        return path(nums,0,0,50,dp);
    }
    public static int path(int []nums,int i,int prev1,int prev2,int [][][]dp)
    {
       if(i==nums.length)
       {
        return 1;

       }
       if(dp[i][prev1][prev2]!=-1)
       {
        return dp[i][prev1][prev2];
       }
        int count=0;
        for(int j=prev1;j<=nums[i];j++)
        {
            int x2=nums[i]-j;
            if(j>=prev1&&x2<=prev2)
            {

                count=(count+path(nums,i+1,j,x2,dp))%mod;
            }
        }
        return dp[i][prev1][prev2]=count;
    }
}