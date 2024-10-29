class Solution {
    public int maxMoves(int[][] grid) {
        int maxi=0;
        int visited[][]=new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++)
        {
            maxi=Math.max(maxi,path(i,0,visited,grid,-1));
        }
        return maxi;
        
    }
    public static int path(int row,int col,int [][]visited,int [][]grid,int prev)
    {
        if(row<0||row>=grid.length||col<0||col>=grid[0].length||(prev!=-1&&grid[row][col]<=prev))
        {
            return -1;
        }
          if(visited[row][col]!=0){
            return visited[row][col];
          }
    
        int xx=1+path(row-1,col+1,visited,grid,grid[row][col]);
        int yy=1+path(row,col+1,visited,grid,grid[row][col]);
        int zz=1+path(row+1,col+1,visited,grid,grid[row][col]);
        return visited[row][col]=Math.max(xx,Math.max(yy,zz));
    }
}