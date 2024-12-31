class Solution {
  static HashMap<Integer, Integer> mapp;
    public int mincostTickets(int[] days, int[] costs) {
         mapp = new HashMap<>();
         mapp.put(0,1);
         mapp.put(1,7);
         mapp.put(2,30);
        int [][]dp=new int[days.length][400];
       for(int i=0;i<days.length;i++)
       {
        for(int j=0;j<400;j++)
        {
            dp[i][j]=-1;
        }
       }
        return path(days,costs,0,0,dp);
    }
    public static int path(int []days,int []costs,int i,int prev,int [][]dp)
    {
         if(i==days.length)
         {
            return 0;
         }
        int maxi=Integer.MAX_VALUE/2;
        if(dp[i][prev]!=-1)
        {
            return dp[i][prev];
        }
        if(prev==0||days[i]>prev)
        {

               for(int k=0;k<costs.length;k++)
        {
             int xx=costs[k]+path(days,costs,i+1,days[i]+mapp.get(k)-1,dp);
             maxi=Math.min(xx,maxi);
        }
        }
        else
        {
          int yy=path(days,costs,i+1,prev,dp);
          maxi=Math.min(yy,maxi);
        }
        return dp[i][prev]=maxi;
       
    }
}