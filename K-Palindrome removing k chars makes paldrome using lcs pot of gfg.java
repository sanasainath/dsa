//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String input_line[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input_line[0]);
            int k = Integer.parseInt(input_line[1]);
            String str = in.readLine();

            Solution ob = new Solution();
            System.out.println(ob.kPalindrome(str, n, k));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int kPalindrome(String str, int n, int k) {
        // code here
        String rev=new StringBuilder(str).reverse().toString();
        
         int dp[]=new int [n+1];
         Arrays.fill(dp,0);



    for(int a=1;a<=n;a++)
    {
        int []dp1=new int[n+1];
        for(int b=1;b<=n;b++)
        {
            if(str.charAt(a-1)==rev.charAt(b-1))
            {
                dp1[b]=1+dp[b-1];
            }
            else
            {
                   int x=dp[b];
            int y=dp1[b-1];
            dp1[b]=Math.max(x,y);
            }
          
        }
        dp=dp1;
    }
    if(n-dp[n]<=k){
        return 1;
    }
    return 0;
    
        // return path(text1,text2,n,m,dp);
        

    
    }
}
