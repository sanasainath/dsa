class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n=grid.length;
        int res=0;
        int m=grid[0].length;
      
       
        for(int i=0;i<=n-3;i++)
        {

            for(int j=0;j<=n-3;j++)
            {
               
    if ((grid[i][j] > 0 && grid[i][j] < 10) &&(grid[i][j+1] > 0 && grid[i][j+1] < 10) &&(grid[i][j+2] > 0 && grid[i][j+2] < 10) &&(grid[i+1][j] > 0 && grid[i+1][j] < 10) &&(grid[i+1][j+1] > 0 && grid[i+1][j+1] < 10) &&(grid[i+1][j+2] > 0 && grid[i+1][j+2] < 10) && (grid[i+2][j] > 0 && grid[i+2][j] < 10) && (grid[i+2][j+1] > 0 && grid[i+2][j+1] < 10) &&(grid[i+2][j+2] > 0 && grid[i+2][j+2] < 10)
)
{
    int rowSum1=grid[i][j]+grid[i][j+1]+grid[i][j+2];
               int rowSum2=grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2];
               int rowSum3=grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                int colSum1=grid[i][j]+grid[i+1][j]+grid[i+2][j];
                int colSum2=grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1];
                int colSum3=grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2];
                int dig1=grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2];
                int dig2=grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j];
                if (rowSum1 == rowSum2 && rowSum2 == rowSum3 &&
    rowSum3 == colSum1 && colSum1 == colSum2 &&
    colSum2 == colSum3 && colSum3 == dig1 &&
    dig1 == dig2)
                {
                     boolean hasDuplicate = checkForDuplicates(grid,i,j);
                    if (!hasDuplicate) {
                        res++;
            
        }

                }
                else
                {
                    continue;
                }
}
else
{
    continue;

}
               



            }



        }
        return res;
        
    }
     public static boolean checkForDuplicates(int[][] matrix,int ss,int tt) {
        HashSet<Integer> elements = new HashSet<>();

        for (int i = ss; i < 3+ss; i++) {
            for (int j = tt; j < 3+tt; j++) {
                // Try to add the element to the HashSet
                if (!elements.add(matrix[i][j])) {
                    // If add returns false, duplicate is found
                    return true;
                }
            }
        }
        // No duplicates found
        return false;
    }
}