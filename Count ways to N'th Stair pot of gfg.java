//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total testcases
        int t = sc.nextInt();

        while (t-- > 0) {

            // taking total number of stairs
            int n = sc.nextInt();

            // creating an object of class DynamicProgramming
            Solution obj = new Solution();

            // calling method of class countWays()
            // of class DynamicProgramming
            System.out.println(obj.countWays(n));
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to count number of ways to reach the nth stair
    // when order does not matter.
    Long countWays(int n) {
        // your code here
        // return path(n);
        // Long res=n/2L;
        // return res+1;
        
    }
    // public static Long path(int n)

    // {
    //     if(n==0||n==1)
    //     {
    //         return 1L;
    //     }
        
    //     long x=path(n-1);
    //     long y=path(n-2);
    //     return x+y;
        
    // }
}
