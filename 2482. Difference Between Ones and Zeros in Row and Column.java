class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int [][]rows=new int[grid.length][2];
        int [][]cols=new int[grid[0].length][2];
        for(int i=0;i<grid.length;i++)
        {
          
            for(int j=0;j<grid[0].length;j++)
            {
            if(grid[i][j]==0)
            {
                rows[i][0]++;
                cols[j][0]++;
                
            }
            
            else if(grid[i][j]==1)
            {
              rows[i][1]++;
              cols[j][1]++;
            }
            
            }
          
        }
        int [][]res=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                res[i][j]=rows[i][1]+cols[j][1]-rows[i][0]-cols[j][0];
            }
        }
        return res;

        
    }
}