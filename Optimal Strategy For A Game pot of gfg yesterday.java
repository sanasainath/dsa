//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class OptimalStrategy
{
    public static void main (String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //inserting the elements
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
           //calling the countMaximum() method of class solve
           System.out.println(new solve().countMaximum(n, arr)); 
        }
    }
    
    
}
// } Driver Code Ends



class solve
{
    //Function to find the maximum possible amount of money we can win.
    static long countMaximum(int n, int arr[])
    {
        // Your code here
        long dp[][]=new long[n][n];
        return path(n,arr,0,n-1,0,dp);
    }
    public static long path(int n,int []arr,int i,int j,int player,long [][]dp)
    {
        if(i>j)
        {
            
            return 0;
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
            
        }
      
       if(player==0)
       {
           return dp[i][j]=Math.max(arr[i]+path(n,arr,i+1,j,1,dp),arr[j]+path(n,arr,i,j-1,1,dp));
           
       }
   
       else
       {
           return dp[i][j]=Math.min(path(n,arr,i+1,j,0,dp),path(n,arr,i,j-1,0,dp));
           
       }
    }
}
