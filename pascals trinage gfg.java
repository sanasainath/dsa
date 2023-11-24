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

            ArrayList<Long> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }
    public static void printAns(ArrayList<Long> ans) {
        for (Long x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
    ArrayList<Long>li=new ArrayList<>(n);
    long mod=1000000007;
    for(int i=0;i<n;i++)
    {
        li.add(0L);
    }
    li.set(0,1L);
    for(int i=0;i<n-1;i++)
    {
        for(int j=n-1;j>=1;j--)
        {
            li.set(j,(li.get(j)%mod+li.get(j-1)%mod)%mod);
        }
    }
    return li;
      
    }
}