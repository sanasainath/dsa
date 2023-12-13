//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    private static final int MOD = 1000000007;

    public static int countStrings(int n) {
        if (n == 0) {
            return 0;
        }

        int endsWithZero = 1;
        int endsWithOne = 1;

        for (int i = 2; i <= n; i++) {
            int tempZero = endsWithZero;
            endsWithZero = (endsWithZero + endsWithOne) % MOD;
            endsWithOne = tempZero;
        }

        return (endsWithZero + endsWithOne) % MOD;
    }

    public static long countStrings(long n) {
        // code here
        long res = countStrings((int) n);
        return res;
    }
}
