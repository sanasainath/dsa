class Solution {
    public int jump(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return path(nums,0,dp);
        
    }
    public static int path(int []nums,int i,int []dp)
    {
           if(i==nums.length-1)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
     
        int maxi=Integer.MAX_VALUE/2;
        for(int j=i+1;j<=i+nums[i]&&j<nums.length;j++)
        {
           
             int xx=1+path(nums,j,dp);
              maxi=Math.min(xx,maxi);
        }
        return dp[i]=maxi;
        
        
    }
}