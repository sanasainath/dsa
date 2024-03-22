//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int ans[] = obj.Series(n);
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {

    int[] Series(int n) {
        // code here
        int []x=new int[n+1];
        x[0]=0;
        x[1]=1;
         int MOD = 1000000007;
       for(int i=2;i<=n;i++)
       {
           int sum=0;
           
               sum=(x[i-1]+x[i-2])%MOD;
               
           
           
           x[i]=sum;
           
           
       }
       return x;
        
        
    }
   
}