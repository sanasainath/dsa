import java.util.*;
import java.io.*;

public class Solution {
    public static int findWays(int num[], int tar) {
        // Write your code here.
        //tabulation
//         int n=num.length;
//         int dp[][]=new int[n][tar+1];
//         for(int y=0;y<n;y++)
//         {
//             dp[y][0]=1;
//         }
//         if(num[0]<=tar)
//         {
//  dp[0][num[0]]=1;
//         }
       
//         for(int i=1;i<n;i++)
//         {
//             for(int target=1;target<=tar;target++)
//             {
//                 int res=dp[i-1][target];
//                 int res1=0;
//                 if(target>=num[i])
//                 {
//                     res1=dp[i-1][target-num[i]];
//                 }
//                 dp[i][target]=res+res1;
//             }
//         }
//         return dp[n-1][tar];


   int n=num.length;
        int dp[]=new int[tar+1];
        Arrays.fill(dp,0);
   dp[0]=1;
   if(num[0]<=tar)
   {
dp[num[0]]=1;
   }
   
   for(int z=1;z<n;z++)
   {
       int []dp1=new int[tar+1];
       dp1[0]=1;
       for(int j=1;j<=tar;j++)
       {
           int res=dp[j];
           int res1=0;
           if(j>=num[z])
           {
               res1=dp[j-num[z]];
           }
           dp1[j]=res+res1;


       }
       dp=dp1;
   }
   return dp[tar];















    }
}
    // public static int path (int []num,int n,int k)
    // {
    //     if(n<0||k<0)
    //     {
    //         return 0;
    //     }
    //       if(k==0)
    //     {
    //         return 1;
    //     }
    //     if(n==0)
    //     {
            
    //      if(num[0]==k)
    //      {
    //          return 1;
    //      }
    //      else
    //      {
    //          return 0;
    //      }

    //     }
      
    //     int x=path(num,n-1,k);
    //     int y=0;
    //     if(k>=num[n])
    //     {
    //           y=path(num,n-1,k-num[n]);
    //     }
    //     return x+y;


    // }
// }