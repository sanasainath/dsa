//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    //taking the String
		    String s=sc.nextLine();
		    Solution ob = new Solution();
		    //calling method sumSubstrings() 
		    System.out.println(ob.sumSubstrings(s));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    // Function to find sum of all possible substrings of the given string.
    public static long sumSubstrings(String s) {
        // Your code here
        long sum = 0;
        long []dp=new long[s.length()];
        dp[0]=s.charAt(0)-'0';
        sum+=dp[0];
        for(int i=1;i<s.length();i++)
        {
            dp[i]=((s.charAt(i)-'0')*(i+1)+(dp[i-1]*10))%1000000007;
            //  dp[i] = (10 * dp[i - 1] + (i + 1) * (s.charAt(i) - '0')) % 1000000007;
            sum+=dp[i];
            sum%=1000000007;
        }
         
         
        
         return sum%1000000007;
    }
}
