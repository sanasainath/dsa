class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int res[][]=new int[m][n];
        if(original.length/n>m)
        {
            return new int[0][0];

        }
      
        int xx=0;
        int row=0;
        int count=0;
        for(int i=0;i<original.length;i++)
        {
          
            
            if(row<m){
            res[row][xx]=original[i];
              count++;
              

            if(xx==n-1) 
            {
                row++;
                xx=-1;
            }
             xx++;
            }
        }
        for(int i=0;i<res.length;i++)
        {
            for(int j=0;j<res[0].length;j++)
            {
                if(res[i][j]==0)
                {
                    return new int[0][0];
                }
            }
        }
        if(count!=original.length)
        {
            return new int[0][0];
        }
        return res;
        
    }
}