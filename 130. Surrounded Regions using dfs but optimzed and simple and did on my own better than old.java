class Solution {
    public static void dfs(boolean [][]visited,char [][]board,int row,int col)
    {
        visited[row][col]=true;
          int[] rowDirs = {-1, 1, 0, 0}; // Up, Down, Left, Right
         int[] colDirs = {0, 0, -1, 1};
         for(int i=0;i<4;i++)
         {
            int rows=rowDirs[i]+row;
            int cols=colDirs[i]+col;
            if(rows>=0&&cols>=0&&rows<board.length&&cols<board[0].length&&board[rows][cols]=='O'&&!visited[rows][cols])
            {
                dfs(visited,board,rows,cols);
            }
         }

    }
    public void solve(char[][] board) {
        
        int n=board.length;
        int m=board[0].length;
        boolean [][]visited=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            if(board[0][i]=='O')
            {
                dfs(visited,board,0,i);
            }
            if(board[n-1][i]=='O')
            {
             dfs(visited,board,n-1,i);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(board[i][0]=='O')
            {
                dfs(visited,board,i,0);
            }
            if(board[i][m-1]=='O')
            {
             dfs(visited,board,i,m-1);
            }
        }
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<m-1;j++)
            {
                if(board[i][j]=='O'&&!visited[i][j])
                {
                    board[i][j]='X';
                }

            }
        }
        
      

    }
}