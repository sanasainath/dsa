class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
      
        int n=text1.length();
        int m=text2.length();
          int dp[]=new int [m+1];
    //    for(int []row:dp)
    //    {
    //        Arrays.fill(row,-1);
    //    }
    //tabulation
//   for (int i = 0; i < n ; i++) {
//     dp[i][0] = 0;   // Initialize the first column to 0
//    // Initialize the first row to 0
// }
// for(int j=0;j<m;j++)
// {
//     dp[0][j]=0;
// }

//     for(int a=1;a<=n;a++)
//     {
//         for(int b=1;b<=m;b++)
//         {
//             if(text1.charAt(a-1)==text2.charAt(b-1))
//             {
//                 dp[a][b]=1+dp[a-1][b-1];
//             }
//             else
//             {
//                    int x=dp[a-1][b];
//             int y=dp[a][b-1];
//             dp[a][b]=Math.max(x,y);
//             }
          
//         }
//     }
//     return dp[n][m];
//  for (int i = 0; i < n ; i++) {
//     dp[i][0] = 0;   // Initialize the first column to 0
//    // Initialize the first row to 0
// }
// for(int j=0;j<m;j++)
// {
//     dp[0][j]=0;
// }
Arrays.fill(dp,0);



    for(int a=1;a<=n;a++)
    {
        int []dp1=new int[m+1];
        for(int b=1;b<=m;b++)
        {
            if(text1.charAt(a-1)==text2.charAt(b-1))
            {
                dp1[b]=1+dp[b-1];
            }
            else
            {
                   int x=dp[b];
            int y=dp1[b-1];
            dp1[b]=Math.max(x,y);
            }
          
        }
        dp=dp1;
    }
    return dp[m];
    
        // return path(text1,text2,n,m,dp);
        

    }
    // public static int path(String text1,String text2,int n,int m,int [][]dp)
    // {
    //     if(n==0||m==0)
    //     {
    //         return 0;
    //     }
    //     if(text1.charAt(n-1)==text2.charAt(m-1))
    //     {
    //         return 1+path(text1,text2,n-1,m-1,dp);
    //     }
    //     if(dp[n][m]!=-1)
    //     {
    //         return dp[n][m];
    //     }
    //     int x=path(text1,text2,n-1,m,dp);
    //     int y=path(text1,text2,n,m-1,dp);
    //     return dp[n][m]=Math.max(x,y);
    // }

}