
class Solution {
    public long numberOfRightTriangles(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int arr[]=new int[n];
       int arr1[]=new int[m];
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            arr[i]+=grid[i][j];
            arr1[j]+=grid[i][j];
        }
       }
       long count=0;
       for(int i=0;i<n;i++)
       {
        for(int j=0;j<m;j++)
        {
            if(grid[i][j]==1)
            {
                count+=(arr[i]-1)*(arr1[j]-1);
            }

        }
       }
       return count;

    }
}
