
class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        // return path(N,arr,1,arr.length-1);
        int [][]dp=new int[N][N];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        for(int i=0;i<N;i++)
        {
            dp[i][i]=0;
        }
       
        for(int i=N-1;i>0;i--)
        {
            for(int j=i+1;j<N;j++)
            {
                 int maxi=Integer.MAX_VALUE;
                 for(int k=i;k<j;k++)
        {
            int step=(arr[i-1]*arr[k]*arr[j])+dp[i][k]+dp[k+1][j];
            maxi=Math.min(step,maxi);
            dp[i][j]=maxi;
        }
            }
        }
        return dp[1][N-1];
    }
    // public static int path(int n,int []arr,int i,int j)
    // {
    //     if(i==j)
    //     {
    //         return 0;
    //     }
    //     int maxi=Integer.MAX_VALUE;
    //     for(int k=i;k<j;k++)
    //     {
    //         int step=arr[i-1]*arr[k]*arr[j]+path(n,arr,i,k)+path(n,arr,k+1,j);
    //         maxi=Math.min(step,maxi);
    //     }
    //     return maxi;
        
        
    // }
}