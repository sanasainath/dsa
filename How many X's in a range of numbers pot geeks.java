//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            int X = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.countX(L, R, X));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countX(int L, int R, int X) {
        // code here
        int z=L+1;
        String q=Integer.toString(X);
        int count=0;
        
        while(z<R)
        {
            String zString = String.valueOf(z);
     for (int i = 0; i < zString.length(); i++) {
    // Check if the character at position i is equal to '1'
    if (zString.charAt(i) == q.charAt(0)) {
        count++;
    }
}
z++;

        }
        return count;
        
    }
};