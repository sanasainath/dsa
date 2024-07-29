class Solution {
    public int numTeams(int[] rating) {
        
      int [][][]dp=new int [rating.length][rating.length+1][3];
      int [][][]dp1=new int[rating.length][rating.length+1][3];
        for (int[][] dp2 : dp) {
            for (int[] dp3 : dp2) {
                java.util.Arrays.fill(dp3, -1);
            }
        }
        for (int[][] dp2 : dp1) {
            for (int[] dp3 : dp2) {
                java.util.Arrays.fill(dp3, -1);
            }
        }
        
        return path(rating,0,-1,0,dp)+path1(rating,0,-1,0,dp1);
    }
    public static int path(int []rating,int i,int prev,int count,int [][][]dp)
    {
        if(count==3)
        {
            return 1;
        }
        if(i==rating.length)
        {
            return 0;
        }
        if(dp[i][prev+1][count]!=-1)
        {
            return dp[i][prev+1][count];
        }

        int x=0;
        if(prev==-1||rating[i]<rating[prev])
        {
            x=path(rating,i+1,i,count+1,dp);
        }
        int y=path(rating,i+1,prev,count,dp);
        return dp[i][prev+1][count]=x+y;
    }
     public static int path1(int []rating,int i,int prev,int count,int [][][]dp1)
    {
        if(count==3)
        {
            return 1;
        }
        if(i==rating.length)
        {
            return 0;
        }
        if(dp1[i][prev+1][count]!=-1)
        {
            return dp1[i][prev+1][count];
        }

        int x=0;
        if(prev==-1||rating[i]>rating[prev])
        {
            x=path1(rating,i+1,i,count+1,dp1);
        }
        int y=path1(rating,i+1,prev,count,dp1);
        return dp1[i][prev+1][count]=x+y;
    }
}