import java.util.Arrays;

public class Solution {
    public static String findLCS(int n, int m, String s1, String s2){
       String[][] dp = new String[n + 1][m + 1];
       for (String[] rows : dp) {
           Arrays.fill(rows, ""); // Initialize with empty strings
       }
       return path(n, m, s1, s2, dp);
    }
    
    public static String path(int n, int m, String s1, String s2, String[][] dp) {
        if (n == 0 || m == 0) {
            return "";
        }
        
        if (dp[n][m] != null) {
            return dp[n][m];
        }
        
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return dp[n][m] = path(n - 1, m - 1, s1, s2, dp) + s1.charAt(n - 1);
        } else {
            String w = path(n - 1, m, s1, s2, dp);
            String q = path(n, m - 1, s1, s2, dp);
            if (w.length() > q.length())
                return dp[n][m] = w;
            else
                return dp[n][m] = q;
        }
    }
}
