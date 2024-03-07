//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.longestSubstring(S, N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static String longestSubstring(String s, int n) {
        // code here
        if(n<=1)
        {
            return "-1";
        }
        int [][]dp=new int[n+1][n+1];
        for(int i=0;i<n;i++)
        {
           
                    dp[i][i]=0;
             
        }
        int maxJ = -1;
int maxK = -1;
        int maxi=Integer.MIN_VALUE;
        for(int j=0;j<n;j++)
        {
            
            for(int k=j+1;k<n;k++)
            {
                if(s.charAt(j)==s.charAt(k))
                {
                   
                    
                    if(j>0)
                    {
                        dp[j][k]=1+dp[j-1][k-1];
                    }
                    else if(j<=0)
                    {
                        dp[j][k]=1;
                    }
                    if(k-j<dp[j][k])
                    {
                        dp[j][k]=0;
                    }
                         if (dp[j][k] > maxi) {
            maxi = dp[j][k];
            maxJ = j;
            maxK = k;
        }
                    
                }
           
                
            }
        }
        StringBuilder st=new StringBuilder();
        while(maxi!=0)
        
        {
          st.append(s.charAt(maxJ));

            maxi--;
            maxJ--;
            
            
        }
        return st.reverse().toString();
        
        
    }
};