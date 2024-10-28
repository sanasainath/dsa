class Solution {
    public int maximalSquare(char[][] matrix) {
             int m=matrix.length;
        int n=matrix[0].length;
        int [][]dp=new int[m][n];
           for(int i=0;i<m;i++)
        {
            if(matrix[i][0]=='1')
            {
                    dp[i][0]=1;

            }
            else
            {
                dp[i][0]=0;
            }
        
      
        }
         for(int i=0;i<n;i++)
         {
                if(matrix[0][i]=='1')
            {
                    dp[0][i]=1;

            }
            else
            {
                dp[0][i]=0;
            }
         }
         for(int i=1;i<m;i++)
         {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]!='0')
                {
                      dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j-1],dp[i-1][j]));
                }

              
            }
         }
         int maxi=0;
          for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
            {
                maxi=Math.max(maxi,dp[i][j]);
            }
         }
         return maxi*maxi;
        
    }
}