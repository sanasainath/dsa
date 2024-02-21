//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.countWays(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int[][][] dp;

    public int countWays(int N, String S) {
        dp = new int[N][N][2];
        // Initialize dp array to -1
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return mcs(S, 0, S.length() - 1, true);
    }

    private int mcs(String s, int i, int j, boolean isTrue) {
        // Base case (smallest valid input)
        if (i > j) return 0;
        if (i == j) {
            if (isTrue) return s.charAt(i) == 'T' ? 1 : 0;
            else return s.charAt(i) == 'F' ? 1 : 0;
        }
        
        // Searching table
        if (dp[i][j][isTrue ? 1 : 0] != -1) return dp[i][j][isTrue ? 1 : 0] % 1003;

        // Recursive case
        int res = 0;
        for (int k = i + 1; k <= j - 1; k += 2) {
            int lt, rt, lf, rf;

            // Calculating lt, rt, lf, rf variables
            // Left true
            lt = dp[i][k - 1][1] != -1 ? dp[i][k - 1][1] : mcs(s, i, k - 1, true);
            // Left false
            lf = dp[i][k - 1][0] != -1 ? dp[i][k - 1][0] : mcs(s, i, k - 1, false);
            // Right true
            rt = dp[k + 1][j][1] != -1 ? dp[k + 1][j][1] : mcs(s, k + 1, j, true);
            // Right false
            rf = dp[k + 1][j][0] != -1 ? dp[k + 1][j][0] : mcs(s, k + 1, j, false);

            // Calculating answer based on the operator (k)
            if (s.charAt(k) == '&') {
                if (isTrue)
                    res += (lt * rt);
                else
                    res += (lt * rf + lf * rt + lf * rf);
            } else if (s.charAt(k) == '|') {
                if (isTrue)
                    res += (lt * rf + lf * rt + lt * rt);
                else
                    res += (lf * rf);
            } else if (s.charAt(k) == '^') {
                if (isTrue)
                    res += (lt * rf + lf * rt);
                else
                    res += (lt * rt + lf * rf);
            }
            dp[i][j][isTrue ? 1 : 0] = res % 1003;
        }

        return dp[i][j][isTrue ? 1 : 0] % 1003;
    }
}