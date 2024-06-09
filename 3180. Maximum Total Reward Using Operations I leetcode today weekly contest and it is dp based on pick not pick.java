    class Solution {
        public int maxTotalReward(int[] rewardValues) {
            Arrays.sort(rewardValues);
        int [][]dp=new int[rewardValues.length][4001];
        for(int []rows:dp)
        {
            Arrays.fill(rows,-1);
        }
            return path(rewardValues,0,0,dp);
        }
        public static int path(int []arr,int i,int x,int [][]dp)
        {
            if(i==arr.length)
            {
                return 0;
            }
            if(dp[i][x]!=-1)
            {
                return dp[i][x];
            }
            int xx=0+path(arr,i+1,x,dp);
            int yy=0;
            if(x<arr[i])
            {
                yy=arr[i]+path(arr,i+1,x+arr[i],dp);
            }
            return dp[i][x]=Math.max(xx,yy);
        }
    }