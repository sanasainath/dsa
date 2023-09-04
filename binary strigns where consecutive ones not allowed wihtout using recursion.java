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
    long countStrings(int n) {
        // code here
        int start=1;
        int end=1;
        int sum=start+end;
        if(n==1)
        {
            return sum;
        }
        int i=2;
        while(i<=n)
        {
            end=start%(1000000007);
            start=sum%(1000000007);
            sum=start+end%(1000000007);
            i++;
        }
        return sum%(1000000007);
    }
}