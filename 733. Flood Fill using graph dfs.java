class Solution {
   
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         int n=image.length;
        int m=image[0].length;
        boolean [][] visited=new boolean[n][m];
        int target=image[sr][sc];
        int []row={-1,0,+1,0};
        int []col={0,+1,0,-1};
       path(sr,sc,image,visited,color,target,row,col);
       return image;

        
    }
      public static void path(int sr,int sc,int [][]image,boolean [][]visited,int color,int target,int []row,int []col)
    {
         int n=image.length;
        int m=image[0].length;
        image[sr][sc]=color;
        visited[sr][sc]=true;
        for(int i=0;i<4;i++)
        {
            int r=sr+row[i];
            int c=sc+col[i];
            if(r<n&&c<m&&r>=0&&c>=0&&image[r][c]==target&&!visited[r][c])
            {
                path(r,c,image,visited,color,target,row,col);
            }

        }
        
    }
}