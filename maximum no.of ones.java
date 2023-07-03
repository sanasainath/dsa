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
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    // m is maximum of number zeroes allowed to flip
    
    int findZeroes(int arr[], int n, int m) {
        // code here
        int count=0;
        int left=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
          if(arr[i]==0)
          {
              count++;
          }
          while(count>m)
          {
              if(arr[left]==0)
              {
                  count--;
              }
              left++;
          }
          int len=i-left+1;
          ans=Math.max(ans,len);
        }
        return ans;
    }
}