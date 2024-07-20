class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int nrow = rowSum.length;
        int ncol = colSum.length;
        int[][] matrix = new int[nrow][ncol];

        for (int i = 0; i < nrow; i++) {
            for (int j = 0; j < ncol; j++) {
                // Choose the minimum value between the remaining row sum and column sum
                matrix[i][j] = Math.min(rowSum[i], colSum[j]);
                // Subtract the chosen value from both row and column sums
                rowSum[i] -= matrix[i][j];
                colSum[j] -= matrix[i][j];
            }
        }

        return matrix;
        //   int nrow=rowSum.length;  //tried my approach but getting last two test cases error.....?????????
        // int ncol=colSum.length;
        // int [][]matrix=new int[nrow][ncol];
        // int prev=0;
        // for(int i=0;i<nrow;i++)
        // {
        //     matrix[i][0]=rowSum[i];
        //     prev+=rowSum[i];
        // }
        
        // for(int i=0;i<ncol-1;i++)
        // {
        //     int sum=prev;
        //     prev=0;

        //     if(sum>colSum[i])
        //     {
        //        for(int j=0;j<nrow;j++)
        //        {
        //             if(sum-matrix[j][i]<=colSum[i])
        //             {
        //                 matrix[j][i+1]=sum-colSum[i];
        //                 prev+=matrix[j][i+1];
        //                 matrix[j][i]=matrix[j][i]-matrix[j][i+1];
        //                 break;

        //             }
        //             else
        //             {
        //                 sum-=matrix[j][i];

        //                 matrix[j][i+1]=matrix[j][i];
        //                 prev+=matrix[j][i];
        //                 matrix[j][i]=0;
        //             }
        //        }

        //     }

        // }
        // return matrix;
    }
}
