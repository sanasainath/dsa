class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [][]dp=new int[n+1][2];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        int maxi=0;
        dp[n][0]=0;
        dp[n][1]=0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<2;j++)
            {

            
                    if(j==0)
       {
        
        maxi=Math.max(-prices[i]+dp[i+1][1],0+dp[i+1][0]);

       }
       else
       {
        
         maxi=Math.max(prices[i]+dp[i+1][0],dp[i+1][1]);
       }
       dp[i][j]=maxi;
            }
            
        }
            
        
      
        // return  path(0,prices,n,0,dp);
        
return dp[0][0];
    }


    
    
    // public static int path(int i,int []prices,int n,int buy,int [][]dp)
    // {
    //    if(i==n)
    //    {
        
    //         return 0;
        
    //    }
    //    int maxi=0;
    //    if(dp[i][buy]!=-1)
    //    {
    //     return dp[i][buy];
    //    }
    //    if(buy==0)
    //    {
    //     int profit=-prices[i]+path(i+1,prices,n,1,dp);
    //     int profit1=0+path(i+1,prices,n,0,dp);
    //     maxi=Math.max(profit,profit1);

    //    }
    //    else
    //    {
    //     int profit2=prices[i]+path(i+1,prices,n,0,dp);
    //     int profit3=0+path(i+1,prices,n,1,dp);
    //      maxi=Math.max(profit2,profit3);
    //    }
    //    return dp[i][buy]=maxi;

    // }


         


    // 
}