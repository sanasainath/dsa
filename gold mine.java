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
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
 int maxi = 0;

        for (int j = m - 2; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                int current = M[i][j];

                if (j == 0 && current > maxi) {
                    maxi = current;
                }

                int x = (i == 0) ? 0 : M[i - 1][j + 1];
                int y = M[i][j + 1];
                int z = (i == n - 1) ? 0 : M[i + 1][j + 1];

                int r = Math.max(x, Math.max(y, z));

                M[i][j] = M[i][j] + r;
            }
        }

        // Find the maximum value in the first column
        for (int i = 0; i < n; i++) {
            if (M[i][0] > maxi) {
                maxi = M[i][0];
            }
        }

        return maxi;
    }
}