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
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int n){
        // code here
        long q=1;
       
        return x(q,1,n,0);
    }
    public static long x(long q,int a,int n,long ans)
    {
        if(a>n)
        {
            return ans%1000000007;
        }
        long z=1;
        for(int i=0;i<a;i++)
        {
            z=(z*q)%1000000007;
            q++;
        }
        ans=ans+z;
       
          return x(q,a + 1, n, ans);
        
    }
}