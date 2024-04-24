//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java



class Solution
{
    public static int ways(int n, int m)
    {
        // complete the function
        int dp[][]=new int [n+1][m+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return path(n,m,dp);
        
    }
    public static int path(int n,int m,int [][]dp)
    {
          if(m<0||n<0)
        {
            return 0;
        }
        if(n==0&&m==0)
        {
            return 1;
        }
        if(dp[n][m]!=-1)
        {
            return dp[n][m];
        }
      
        
        int x=path(n-1,m,dp);
        int y=path(n,m-1,dp);
        return dp[n][m]=(x+y)%1000000007;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    int x=Integer.parseInt(elements[0]);
		    int y=Integer.parseInt(elements[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.ways(x,y));
		}
	}
}
// } Driver Code Ends