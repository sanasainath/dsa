class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        // int x=Integer.MAX_VALUE;
        int [][]dp=new int [n][m];
        // for(int []d:dp)
        // {
        //     Arrays.fill(d,-1);
        // }
        // for(int i=0;i<n;i++)
        // {
        //     int maxi=help(matrix,n-1,i,dp);
        //     x=Math.min(maxi,x);
        // }
        // return x;
        for(int z=0;z<m;z++)
        {
            dp[0][z]=matrix[0][z];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int x=(j>0)?dp[i-1][j-1]:Integer.MAX_VALUE;
                int y=dp[i-1][j];
                int z=(j<m-1)?dp[i-1][j+1]:Integer.MAX_VALUE;
                dp[i][j]=Math.min(Math.min(x,y),z)+matrix[i][j];
            }
        }
         int minSum = Integer.MAX_VALUE;
        for (int k = 0; k < m; k++) {
            minSum = Math.min(minSum, dp[n - 1][k]);
        }
        
        return minSum;
       
    }
    // public static int help(int [][]matrix,int i,int j,int [][]dp)
    // {
    //     if(i==0)
    //     {
    //        return matrix[i][j];
    //     }
    //     if(dp[i][j]!=-1)
    //     {
    //         return dp[i][j];
    //     }
    //     int x=Integer.MAX_VALUE;
    //     int z=Integer.MAX_VALUE;
    //     if(j>0)
    //     {
    //      x=help(matrix,i-1,j-1,dp)+matrix[i][j];
    //     }
       

    //     int y=help(matrix,i-1,j,dp)+matrix[i][j];
    //     if(j<matrix[0].length-1)
    //     {
    //      z=help(matrix,i-1,j+1,dp)+matrix[i][j];
    //     }
    //    return dp[i][j]=Math.min(Math.min(x, y), z);

    



    // }
}