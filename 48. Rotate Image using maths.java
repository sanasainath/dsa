class Solution {
    public void rotate(int[][] matrix) {
        int left=0;
        int right=matrix.length-1;
        while(left<right)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                int temp=matrix[left][j];
                matrix[left][j]=matrix[right][j];
                matrix[right][j]=temp;
            }
            left++;
            right--;

        }
       for(int i=0;i<matrix.length;i++)
       {
        for(int j=i+1;j<matrix[0].length;j++)
        {
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
       }

        
    }
}