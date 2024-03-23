class Solution {
    public boolean isMatch(String s, String p) {
 
    int m=s.length();
    int n=p.length();
        boolean [][]dp=new boolean[m+1][n+1];
        for(boolean []row:dp)
        {
            Arrays.fill(row,false);
        }
        dp[0][0]=true;
        for(int i=0;i<=m;i++)
        {
            dp[i][0]=false;
        }
        for(int j=1;j<=n;j++)
        {
            if(p.charAt(j-1)!='*')
            {
                dp[0][j]= false;
            }
            dp[0][j]=true;
           
        }
        for(int k=1;k<=m;k++)
        {
            for(int z=1;z<=n;z++)
            {
                      if(s.charAt(k-1)==p.charAt(z-1))
      {
     dp[k][z]=dp[k-1][z-1];
      }
      if(p.charAt(z-1)=='?')
      {
        dp[k][z]=dp[k-1][z-1];
      }
      else if(p.charAt(z-1)=='*')
      {
        // dp[k][z]=dp[k][z-1]||dp[k-1][z];
        dp[k][z] = dp[k][z - 1] || dp[k - 1][z];

      }
     

            }
        }
        return dp[m][n];

    // return path(s,p,m-1,n-1,dp);
        
    }
//     public static boolean path(String s,String p,int m,int n,boolean [][]dp)
//     {
//    if(m==-1&&n==-1)
//    {
//     return true;
//    }
//    if(m==-1)
//    {
//     for(int i=0;i<=n;i++)
//     {
//         if(p.charAt(i)!='*')
//         {
//             return false;
//         }

//     }
//     return true;
//    }
//    if(n==-1)
//    {
//     return false;
//    }
//    if(dp[m][n])
//    {
//     return dp[m][n];
//    }
   


//       if(s.charAt(m)==p.charAt(n))
//       {
//         return dp[m][n]=path(s,p,m-1,n-1,dp);
//       }
//       if(p.charAt(n)=='?')
//       {
//         return dp[m][n]=path(s,p,m-1,n-1,dp);
//       }
//       if(p.charAt(n)=='*')
//       {
//         return dp[m][n]=path(s,p,m,n-1,dp)||path(s,p,m-1,n,dp);

//       }
//       return false;
     


//     }
}