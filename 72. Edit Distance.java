class Solution {
    public int minDistance(String word1, String word2) {
        
        int n=word1.length();
        int m=word2.length();
          int []dp=new int[m+1];

          Arrays.fill(dp,-1);
             for(int i=0;i<=m;i++)
      {
        dp[i]=i;
      }
      for(int z=1;z<=n;z++)
      {
        int dp1[]=new int[m+1];
        dp1[0]=z;
        for(int k=1;k<=m;k++)
        {

              if(word1.charAt(z-1)==word2.charAt(k-1))
        {
            dp1[k] =dp[k-1];
        }
        else
        {
      int x=1+dp1[k-1];//insertion
        int y=1+dp[k];//deletion
        int zz=1+dp[k-1];//replace
          dp1[k]=Math.min(x,Math.min(y,zz));
        }

        }
        dp=dp1;
        
      }
      return dp[m];
        //tabulation
    //     int [][]dp=new int[n+1][m+1];
    //     for(int []row:dp)
    //     {
    //         Arrays.fill(row,-1);
    //     }
        
    //    for(int i=0;i<=m;i++)
    //   {
    //     dp[0][i]=i;
    //   }
        
        
    //          for(int j=0;j<=n;j++)
    //   {
    //     dp[j][0]=j;
    //   }

        
    
      
    //   for(int z=1;z<=n;z++)
    //   {
    //     for(int k=1;k<=m;k++)
    //     {

    //           if(word1.charAt(z-1)==word2.charAt(k-1))
    //     {
    //         dp[z][k] =dp[z-1][k-1];
    //     }
    //     else
    //     {
    //   int x=1+dp[z][k-1];//insertion
    //     int y=1+dp[z-1][k];//deletion
    //     int zz=1+dp[z-1][k-1];//replace
    //       dp[z][k]=Math.min(x,Math.min(y,zz));
    //     }

    //     }
    //   }
    //   return dp[n][m];
//memoization
    // return path(n-1,m-1,word1,word2,dp);
    
    }
    // public static int path(int n,int m,String word1,String word2,int [][]dp)
    // {

    //     if(n==-1)
    //     {
    //         return m+1;
    //     }
    //     if(m==-1)
    //     {
    //         return n+1;
    //     }
    //     if(dp[n][m]!=-1)
    //     {
    //         return dp[n][m];
    //     }
        
    //     if(word1.charAt(n)==word2.charAt(m))
    //     {
    //         return path(n-1,m-1,word1,word2,dp);
    //     }
    //     else
    //     {
    //   int x=1+path(n,m-1,word1,word2,dp);//insertion
    //     int y=1+path(n-1,m,word1,word2,dp);//deletion
    //     int z=1+path(n-1,m-1,word1,word2,dp);//replace
    //      return dp[n][m]=Math.min(x,Math.min(y,z));
    //     }
        
        
       
    // }
}