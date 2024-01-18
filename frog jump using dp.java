import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        dp[0]=0;
           // tabular
           for(int i=1;i<n;i++)
           {
               int left=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
                // int right = Integer.MAX_VALUE;
               if(i>1)
               {
                    int right=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
                    dp[i]=Math.min(left,right);

               }
               else
               {
                   dp[i]=left;
               }

           }

        // return frog(n-1,heights,dp);
        return dp[n-1];

    }
}
    // public static int frog(int n,int []ind,int []dp)
    // {
    //     //memoization
    //     // if(n==0)
    //     // {
    //     //      return 0;
    //     // }
    //     // if(dp[n]!=-1)
    //     // {
    //     //     return dp[n];
    //     // }
    //     // int left=frog(n-1,ind,dp)+Math.abs(ind[n]-ind[n-1]);
    //     //    int right = Integer.MAX_VALUE;
    //     // if(n>1)
    //     // {
    //     //     right=frog(n-2,ind,dp)+Math.abs(ind[n]-ind[n-2]);
    //     // }
    //     // return dp[n]=Math.min(left,right);
    //  

        
    // }

