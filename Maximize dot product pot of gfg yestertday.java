//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    int a[] = new int[n];
                    int b[] = new int[m];
                    for(int i = 0;i<n;i++)
                        a[i] = sc.nextInt();
                    for(int i = 0;i<m;i++)
                        b[i] = sc.nextInt();    
                    Solution ob = new Solution();
                    System.out.println(ob.maxDotProduct(n, m, a, b));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxDotProduct(int n, int m, int a[], int b[]) 
	{ 
	    if(m>n)
	    {
	        return 0;
	    }
	    int [][]dp=new int[n][m];
	    for(int []row:dp)
	    {
	        Arrays.fill(row,-1);
	        
	    }
	    int zeroes=n-m;
	    return path(n,m,a,b,0,0,zeroes,dp);
	    
	
		
	} 
	public static int path(int n,int m,int a[],int []b,int i,int j,int zeroes,int [][]dp)
	{	    if(i==n||j==m)
	    {
	        return 0;
	    }
	    if(dp[i][j]!=-1)
	    {
	        return dp[i][j];
	    }
	    int x=0;
	    if(zeroes>0)
	    {
	        
	         x=0+path(n,m,a,b,i+1,j,zeroes-1,dp); 
	    }
	 
	    int y=a[i]*b[j]+path(n,m,a,b,i+1,j+1,zeroes,dp);
	    return dp[i][j]=Math.max(x,y);
	}

	
	    
	    
	    
}
