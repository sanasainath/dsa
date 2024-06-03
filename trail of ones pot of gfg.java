//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfConsecutiveOnes(N));
        }
    }
}
// } Driver Code Ends

class Solution {
    static int numberOfConsecutiveOnes(int n) {
        int MOD = (int)1e9 +7;
        
        int prevFib = 1, curFib = 1;
        int cur = 1;
        
        for(int i=3; i<=n; i++){
            cur =  ((cur*2)%MOD + curFib)%MOD;
            int temp = prevFib;
            prevFib = curFib;
            curFib = (curFib + temp)%MOD;
        }
        
        return cur;
    }
}