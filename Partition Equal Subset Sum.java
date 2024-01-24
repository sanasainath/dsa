public class Solution {
	public static boolean canPartition(int[] arr, int n) {
		// Write your code here.
		int sum=0;
	
		for(int i=0;i<n;i++)
		{
           sum=sum+arr[i];
		}
		if((sum%2)!=0)
		{
			return false;
		}
		int s=sum/2;
			boolean [][]dp=new boolean[n][s+1];
		// return sub(arr,n-1,s,dp);
		for(int i=0;i<n;i++)
		{
			dp[i][0]=true;
		}
		if(arr[0]<=s)
		{
               dp[0][arr[0]] = true;
		}
		 for (int i = 1; i < n; i++) {
        for (int j = 1; j <= s; j++) {
            boolean a = dp[i - 1][j];
            boolean b = false;

            if (j >= arr[i]) {
                b = dp[i - 1][j - arr[i]];
            }

            dp[i][j] = a || b;
        }
    }

    return dp[n - 1][s];
	}
	// public static boolean sub(int []arr,int n,int s,boolean[][] dp)

	// {
	// 	if(s==0)
	// 	{
	// 		return true;
	// 	}
	// 	if(n==0)
	// 	{
	// 		return arr[0]==s;
	// 	}
	// 	if(dp[n][s])
	// 	{
	// 		return dp[n][s];
	// 	}
	//     boolean a=sub(arr,n-1,s,dp);
	// 	boolean  b=false;
	// 	if(s>=arr[n])
	// 	{
	// 		b=sub(arr,n-1,s-arr[n],dp);
	// 	}
	// 	dp[n][s]=a||b;
	// 	return a||b;

     
       
	// }
}