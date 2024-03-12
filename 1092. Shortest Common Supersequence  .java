class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
       int[][] dp = new int[n + 1][m + 1];
    
    // Initialize the first row and column of the dp array to 0
    for (int i = 0; i <= n; i++) {
        dp[i][0] = 0;
    }
    for (int j = 0; j <= m; j++) {
        dp[0][j] = 0;
    }

    // Fill the dp array using bottom-up approach
    for (int a = 1; a <= n; a++) {
        for (int b = 1; b <= m; b++) {
            if (str1.charAt(a - 1) == str2.charAt(b - 1)) {
                dp[a][b] = 1 + dp[a - 1][b - 1];
            } else {
                dp[a][b] = Math.max(dp[a - 1][b], dp[a][b - 1]);
            }
        }
    }

    // Now construct the LCS string
    int len = (n+m)-dp[n][m];
    int i = n;
    int j = m;
    int index = len - 1;
    StringBuilder lcsBuilder = new StringBuilder();
    
    // Create a StringBuilder with the length of the LCS, filled with placeholders
    for (int k = 0; k < len; k++) {
        lcsBuilder.append('$');
    }
    
    while (i > 0 && j > 0) {
        if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
            lcsBuilder.setCharAt(index, str1.charAt(i - 1));
            index--;
            i--;
            j--;
        } else if (dp[i - 1][j] > dp[i][j - 1]) {
            lcsBuilder.setCharAt(index,str1.charAt(i-1));
            index--;
            i--;
        } else {
             lcsBuilder.setCharAt(index,str2.charAt(j-1));
             index--;
            j--;
        }
    }
    while(i<=0&&j>0)
    {
         lcsBuilder.setCharAt(index,str2.charAt(j-1));
         index--;
        j--;
    }
    while(j<=0&&i>0)
    {
         lcsBuilder.setCharAt(index,str1.charAt(i-1));
         index--;
         i--;
    }
    
    // Convert StringBuilder to String and return the LCS
    return lcsBuilder.toString();

    
    }
}