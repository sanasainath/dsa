class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
         if (n == 0 || amount == 0) {
            return 0; // If there are no coins or amount is 0, return 0 coins needed
        }
        //tabulation
// int [][]dp=new int [n][amount+1];
// for(int u=0;u<n;u++)
// {
//     dp[u][0]=0;
// }
// for(int i=0;i<=amount;i++)
// {
//     if(i%coins[0]==0)
//     {
//       dp[0][i]=i/coins[0];
//     }
//     else
//     {
//         dp[0][i]=(int)Math.pow(10,9);
//     }

// }
// for(int j=1;j<n;j++)
// {
//     for(int k=1;k<=amount;k++)
//     {
//         int take=(int)Math.pow(10,9);
//         if(k>=coins[j])
//         {
//             take=1+dp[j][k-coins[j]];
//         }
//         int notake=dp[j-1][k];
//         dp[j][k]=Math.min(take,notake);
//     }
// }
// if(dp[n-1][amount]>=(int)Math.pow(10,9))

// {
//     return -1;
    
// }
// return dp[n-1][amount];

    //  int n = coins.length;
    //     if (n == 0)
    //         return -1;

        int[] dp = new int[amount + 1];
        
      dp[0]=0;
        for (int i = 1; i <= amount; i++) {
            if (i % coins[0] == 0) {
                dp[i] = i / coins[0];
            } else {
                dp[i] = (int) Math.pow(10, 9);
            }
        }

        for (int j = 1; j < n; j++) {
            int[] dp1 = new int[amount + 1];
            dp1[j]=(int)Math.pow(10,9);
            dp1[0] = 0;
            for (int k = 1; k <= amount; k++) {
                int take = (int) Math.pow(10, 9);
                if (k >= coins[j]) {
                    take = 1 + dp[k - coins[j]];
                }
                int notake = dp[k];
                dp1[k] = Math.min(take, notake);
            }
            dp = dp1;
        }

        if (dp[amount] >= (int) Math.pow(10, 9)) {
            return -1;
        }
        return dp[amount];
    //  int result=path(coins,amount,n-1,dp);
    //  if(result>=Math.pow(10,9))
    //  {
    //      return -1;
    //  }
    //  return result;

        
    }
    // public static int path(int []coins,int amount,int n,int [][]dp)
    // {
    //     // if(amount==0)
    //     // {
    //     //     return 0;
    //     // }
    //     if(n==0)
    //     {
    //         if(amount%coins[0]==0)
    //         {
    //             return amount/coins[0];
    //         }
    //         else
    //         {
    //                  return (int)Math.pow(10,9);
    //         }
       
    //     }
    //     // if(amount<0||n<0)
    //     // {
    //     //     return Integer.MAX_VALUE;
    //     // }
      
    //     // li.add(coins[n]);
    //     if(dp[n][amount]!=-1)
    //     {
    //         return dp[n][amount];
    //     }              
    //   int take=Integer.MAX_VALUE;
    //     int nottake=path(coins,amount,n-1,dp);
    //   if(amount>=coins[n])
    //   {
    //     take=1+path(coins,amount-coins[n],n,dp);
    //   }
      
    // //   li.remove(li.size()-1);
  
    // return dp[n][amount]=Math.min(take,nottake);


      
    // }
}