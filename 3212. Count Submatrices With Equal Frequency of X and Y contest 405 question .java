class Pair{
    int row;
    int col;
    Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
         Pair [][]presum=new Pair[n][m];
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<m;j++)
            {
                presum[i][j]=new Pair(0,0);
            }
         }
         for(int i=0;i<n;i++)
         {
            if(grid[i][0]=='X')
            {
                 presum[i][0].row++;

            }
            else if(grid[i][0]=='Y')
            {
                 presum[i][0].col++;

            }
           
         }
         //row PrefixSum...
         for(int i=0;i<n;i++)
         {
            for(int j=1;j<m;j++)
            {
                if(grid[i][j]=='X')
                {
                    presum[i][j].row+=1;

                }
                else if(grid[i][j]=='Y')
                {
                     presum[i][j].col+=1;

                }
                presum[i][j].row+=presum[i][j-1].row;
                presum[i][j].col+=presum[i][j-1].col;

                
            }
         }
         //column prefix Sum
           for(int i=1;i<n;i++)
         {
            for(int j=0;j<m;j++)
            {
               
                presum[i][j].row+=presum[i-1][j].row;
                presum[i][j].col+=+presum[i-1][j].col;

                
            }
         }
         int count=0;
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<m;j++)
            {
                if(presum[i][j].row>0&&presum[i][j].row==presum[i][j].col)
                {
                    count++;
                }
            }
         }
         return count;


        
    }
}