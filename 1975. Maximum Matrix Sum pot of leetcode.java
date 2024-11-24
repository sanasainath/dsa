class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int negsum=0;
        long total=0;
        int minneg=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<=0)
                {
                    negsum++;
                    minneg=Math.min(minneg,-matrix[i][j]);
                    total+=(-matrix[i][j]);
                }
                else
                {
                       minneg=Math.min(minneg,matrix[i][j]);
                    total+=matrix[i][j];
                }
            }
        }
        if(negsum%2==0)
        {
              for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<0)
                {
                  sum+=(-matrix[i][j]);
                }
                else
                {
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
        }
        return total-minneg-minneg;


        
    }
}