class Solution
{
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int n=str1.length();
	    int m=str2.length();
	    
	    int [][]dp=new int[n+1][m+1];
	      for(int i=1;i<=n;i++)
	      {
	          for(int j=1;j<=m;j++)
	          {
	              if(str1.charAt(i-1)==str2.charAt(j-1))
	              {
	                   dp[i][j]=1+dp[i-1][j-1];
	                  
	              }
	              else
	              {
	                  dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	              }
	              
	              
	          }
	      }
	      int res=n-dp[n][m];
	      int diff=m-dp[n][m];
	      return res+diff;
	     
	 
	    
	    
	} 
}