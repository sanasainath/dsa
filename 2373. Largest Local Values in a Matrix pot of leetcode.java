class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        int n=grid.length;
      
int result = (n >= 3) ? (n - 2) : 1; 

 int [][]res=new int[result][result]; 
                      
        int left=0;
        int right=0;
       int xx=0;int yy=0;
        while(left<=n-3)
        {
            right=0;
            yy=0;
            while(right<=n-3)
            {

            
            int maxi=Integer.MIN_VALUE;
            for(int i=left;i<left+3;i++)
            {
                for(int j=right;j<right+3;j++)
                {

                    maxi=Math.max(maxi,grid[i][j]);

                }
            }
            res[xx][yy]=maxi;
            yy++;
            right++;
            }
            xx++;
            left++;

        }
        return res;
   

    }
}