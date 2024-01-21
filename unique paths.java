import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int [][]dp=new int[m][n];
		for(int []row:dp)
		{
			Arrays.fill(row,-1);
		}
		return path(m-1,n-1,dp);
	}
	public static int path(int m,int n,int [][]dp)
	{
		if(m==0&&n==0)
		{
			return 1;
		}
		if(m<0||n<0)
		{
			return 0;
		}
		if(dp[m][n]!=-1)
		{
			return dp[m][n];
		}
		int a=path(m-1,n,dp);
		int b=path(m,n-1,dp);
		return dp[m][n]=a+b;
	}
}