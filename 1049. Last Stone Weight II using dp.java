class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
      int totalsum = 0;
    
for (int i = 0; i < n; i++) {
    totalsum += stones[i];
}
  int dp[]=new int[totalsum+1];
  Arrays.fill(dp,-1);

double target = Math.ceil((double)totalsum / 2);

        return path(0,stones,n,target,0,totalsum,dp);
       

      
       
    }

    public static int path(int i, int[] stones, int n , double target,int sum,int totalsum,int []dp) {
        if (sum>=target||i==n) {
            return  Math.abs(sum-(totalsum-sum));
        }
        if(dp[sum]!=-1)
        {
            return dp[sum];
        }
      int x=path(i+1,stones,n,target,sum+stones[i],totalsum,dp);
      int y=path(i+1,stones,n,target,sum,totalsum,dp);

   
        return  dp[sum]=Math.min(x,y);
    }
}
