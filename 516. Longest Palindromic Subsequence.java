class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        //solving using lcs 
          String reversed = new StringBuilder(s).reverse().toString();
        
        int []dp= new int[n+1];
        Arrays.fill(dp,0);



    for(int a=1;a<=n;a++)
    {
        int []dp1=new int[n+1];
        for(int b=1;b<=n;b++)
        {
            if(s.charAt(a-1)==reversed.charAt(b-1))
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
    return dp[n];

        //    for(int i=0;i<n;i++)
        //    {
        //        dp[i][1]=1;
        //    }
        //    for(int j=0;j<n;j++)
        //    {
               
        //    }
        // return path(s,n-1,0,"",dp);
        
    }
    // public static int path(String s,int n,int i,String x,int [][]dp)
    // {
    //    if(i>n)
    //    {
    //        int start=0;
    //        int end=x.length()-1;
    //        boolean flag=true;
    //      while(start<=end)
    //      {
    //          if(x.charAt(start)!=x.charAt(end))
    //          {
    //              flag=false;
    //          }
    //          start++;
    //          end--;
    //      }
    //      if(flag)
    //      {
    //          return x.length();
    //      }
    //      return 0;

    //    }
          
    //     int z=path(s,n,i+1,x+s.charAt(i),dp);
    //     int y=path(s,n,i+1,x,dp);
    //     return dp[i][]=Math.max(z,y);

    // }
}