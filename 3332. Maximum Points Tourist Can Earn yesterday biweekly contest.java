class Solution {
    public int maxScore(int n, int k, int[][] stayScore, int[][] travelScore) {
        int day=0;
     
        int maxi=0;
        int [][]dp=new int[n][k];
       for(int []row:dp)
       {
        Arrays.fill(row,-1);
       }
        for(int i=0;i<n;i++)
        {
            int xx=stayScore[0][i]+path(stayScore,travelScore,day+1,n,i,k,dp);
              int yy=0;
        for(int ii=0;ii<n;ii++)
        {
            if(i==ii)
            {
                continue;
            }
            yy=Math.max(yy,travelScore[i][ii]+path(stayScore,travelScore,day+1,n,ii,k,dp));
        }
        int zz=Math.max(xx,yy);
        maxi=Math.max(zz,maxi);
     
        }
        return maxi;
        
    }
    public static int path(int [][]stayScore,int [][]travelScore,int day,int n,int currcity,int k,int [][]dp)
    {
         if(day>=k)
         {
            return 0;
         }
         if(dp[currcity][day]!=-1)
         {
            return dp[currcity][day];
         }
        int xx=stayScore[day][currcity]+path(stayScore,travelScore,day+1,n,currcity,k,dp);
        int yy=0;
        for(int ii=0;ii<n;ii++)
        {
             if(currcity==ii)
            {
                continue;
            }
            yy=Math.max(yy,travelScore[currcity][ii]+path(stayScore,travelScore,day+1,n,ii,k,dp));
        }
        return dp[currcity][day]=Math.max(xx,yy);

    }
}