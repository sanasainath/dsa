class Solution {
    public void rotate(int[][] matrix) {
            for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[0].length;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    
       
            for(int i=0;i<matrix.length;i++)
            {
                int top=0;
                int bottom=matrix[0].length-1;
                while(top<bottom)
                {
                    int temp=matrix[i][top];
                matrix[i][top]=matrix[i][bottom];
                matrix[i][bottom]=temp;
                top++;
                bottom--;
                }
              
                
            }
           
        
    }
}