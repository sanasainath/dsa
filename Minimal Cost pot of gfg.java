Minimal Cost
Difficulty: MediumAccuracy: 51.08%Submissions: 52K+Points: 4
There is an array arr of heights of stone and Geek is standing at the first stone and can jump to one of the following: Stone i+1, i+2, ... i+k stone, where k is the maximum number of steps that can be jumped and cost will be |hi-hj| is incurred, where j is the stone to land on. Find the minimum possible total cost incurred before the Geek reaches the last stone.

Example:

Input: k = 3, arr[]= [10, 30, 40, 50, 20]
Output: 30
Explanation: Geek will follow the path 1->2->5, the total cost would be | 10-30| + |30-20| = 30, which is minimum
Input: k = 1, arr[]= [10, 20, 10]
Output: 20
Explanation: Geek will follow the path 1->2->3, the total cost would be |10 - 20| + |20 - 10| = 20.



class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
        int []dp=new int[arr.length];
        Arrays.fill(dp,-1);
        return path(k,arr,0,dp);
    }
    public static int path(int k,int []arr,int i,int []dp)
    {
        if(i==arr.length-1)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        
        int maxi=Integer.MAX_VALUE;
        for(int j=i+1;j<=i+k&&j<arr.length;j++)
        {
            int xx=Math.abs(arr[i]-arr[j])+path(k,arr,j,dp);
            maxi=Math.min(maxi,xx);
        }
        return dp[i]=maxi;
    }
}
