//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
          if (n == 0) {
            return 0; // No set bits
        }

        int position = 1;
        // Use bitwise AND with negation to isolate the rightmost set bit
        int rightmostSetBit = n & -n;

        // Right shift until the rightmost set bit becomes 1
        while (rightmostSetBit > 1) {
            rightmostSetBit >>= 1;
            position++;
        }

        return position;
    }
}