class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int maxi=Integer.MAX_VALUE;
        int n=matrix.length;
        int [][]dp=new int[n][n];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        // for(int i=0;i<n;i++)
        // {
           
        //         maxi=Math.min(maxi,path(0,i,matrix,dp));
         
        // }
        // return maxi;
        for(int i=0;i<n;i++)
        {
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               dp[i][j]=matrix[i][j]+dp[i-1][j];
               if(j>0)
               {
                dp[i][j]=Math.min(dp[i][j],matrix[i][j]+dp[i-1][j-1]);
               }
               if(j<matrix.length-1)
               {
                dp[i][j]=Math.min(dp[i][j],matrix[i][j]+dp[i-1][j+1]);
               }
            }
        }
    for(int i=0;i<n;i++)
    {
        maxi=Math.min(maxi,dp[n-1][i]);
    }
    return maxi;
        
    }
    // public static int path(int i,int j,int [][]matrix,int [][]dp)
    // {
        
    //     if(i==matrix.length-1&&j>=0&&j<matrix.length)
    //     {
    //         return matrix[i][j];
    //     }
    //     if(j<0||j>=matrix.length||i<0||j>=matrix.length)
    //     {
    //         return Integer.MAX_VALUE;
    //     }
    //     if(dp[i][j]!=-1)
    //     {
    //         return dp[i][j];
    //     }
    //     int xx=path(i+1,j-1,matrix,dp);
    //     int yy=path(i+1,j,matrix,dp);
    //     int zz=path(i+1,j+1,matrix,dp);
    //     return dp[i][j]=matrix[i][j]+Math.min(xx,Math.min(yy,zz));
    // }
}