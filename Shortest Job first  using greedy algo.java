//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.solve(a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int solve(int bt[] ) {
        
    // code here
    int n=bt.length;
    Arrays.sort(bt);
    int []sum=new int[n];
    sum[0]=0;
    for(int i=1;i<n;i++)
    {
        sum[i]=sum[i-1]+bt[i-1];
    }
    int res=0;
    for(int i=0;i<n;i++)
    {
        res+=sum[i];
    }
    return res/n;
    

  }
}
     