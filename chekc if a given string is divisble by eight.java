//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        //code here
        
        if(s.length()>=3)
        {
          String x=s.substring(s.length()-3);
          int z=Integer.parseInt(x);
          if(z%8==0)
          {
              return 1;
          }
        }
        else
        {
            int r=Integer.parseInt(s);
            if(r%8==0)
            {
                return 1;
            }
        }
        return -1;
    }
}