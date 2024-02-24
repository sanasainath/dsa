//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        int maxi=Integer.MIN_VALUE; 
        int []dp=new int[n+1];
        return find(n,dp);
    } 
    public static int find(int n,int []dp)
    {
        
        if(n==0||n==1)
        {
            return n;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        
        
       
        int sum=find(n/2,dp)+find(n/3,dp)+find(n/4,dp);
        return dp[n]=Math.max(n,sum);
    }
}
