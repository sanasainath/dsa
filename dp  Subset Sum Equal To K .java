import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        Boolean [][]dp=new Boolean[n][k+1];

        return path(n-1,k,arr,dp);
        
    }
    public static boolean path(int n,int k,int []arr,Boolean [][] dp)
    {
      if (k==0)
      {
          return true;
      }
      if(n==0)
      {
          return (arr[0]==k);
      }
      if(dp[n][k]!=null)
      {
          return dp[n][k];
      }
      boolean a=path(n-1,k,arr,dp);
      boolean b=false;
      if(k>=arr[n])
      {
          b=path(n-1,k-arr[n],arr,dp);
      }
      dp[n][k]=a||b;
      return dp[n][k];
      



    }
}
