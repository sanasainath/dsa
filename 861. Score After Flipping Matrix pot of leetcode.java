class Solution {
    public int matrixScore(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            if(grid[i][0]==0)
            {
                 for(int j=0;j<m;j++)
            {
               grid[i][j]^=1;
            }

            }
           
        }
        for(int i=1;i<m;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                count+=grid[j][i];
            }
            if(count<n-count)
            {
                for(int k=0;k<n;k++)
                {
                    grid[k][i]^=1;
                }
            }


        }
        int sum=0;
       
        for(int i=0;i<n;i++)
        {
             String xx="";
            for(int j=0;j<m;j++)
            {
                 xx+=grid[i][j];

            }
              int number = Integer.parseInt(xx, 2);
              sum+=number;

        }return sum;
        
    }
}