//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            char A[][] = new char[N][N];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().trim().split(" ");
                for (int j = 0; j < N; j++) A[i][j] = S[j].charAt(0);
            }
            Solution ob = new Solution();
            System.out.println(ob.largestSubsquare(N, A));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public class Pair{
        int r;
        int c;
        public Pair(int r,int c)
        {
            this.r=r;
            this.c=c;
        }
    }
    int largestSubsquare(int n, char a[][]) {
        // code here
        
        Pair [][]dp=new Pair[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                Pair p=new Pair(0,0);
                if(a[i][j]=='X')
                {
                    
                   p.r=(j-1>=0)?dp[i][j-1].r+1:1;
                   p.c=(i-1>=0)?dp[i-1][j].c+1:1;
                }
                dp[i][j]=p;
            }
        }
        int maxi=0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                int x=Math.min(dp[i][j].r,dp[i][j].c);
    
                while(x>maxi)
                
                {
                    if(dp[i][j-x+1].c>=x&&dp[i-x+1][j].r>=x)
                    {
                        maxi=Math.max(maxi,x);
                        break;
                    }
                  x--;
                    
                }
            }
        }
        return maxi;
        
    }
};