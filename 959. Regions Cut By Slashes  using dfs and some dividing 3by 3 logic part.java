class Solution {
    public int regionsBySlashes(String[] grid) {
        int n=grid.length;
        int [][]matrix=new int[n*3][n*3];
        for(int rows[]:matrix)
        {
            Arrays.fill(rows,1);
        }
        for(int i=0;i<grid.length;i++)
        {
            String str=grid[i];
             for(int j=0;j<str.length();j++)
             {
                char ch=str.charAt(j);
                if(ch==' ')
                {
                    continue;
                }
                else if(ch=='/')
                {
                    int rows=i*3;
                    int cols=j*3;
                    matrix[rows][cols+2]=0;
                    matrix[rows+1][cols+1]=0;
                    matrix[rows+2][cols]=0;
                }
               else if(ch == '\\')
                {
                    int rows=i*3;
                    int cols=j*3;
                    matrix[rows][cols]=0;
                    matrix[rows+1][cols+1]=0;
                    matrix[rows+2][cols+2]=0;
                }
             }
        }
        int res=0;
        boolean [][]visited=new boolean[n*3][n*3];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(visited[i][j]==false&&matrix[i][j]==1)
                {
                    res++;
                    dfs(visited,matrix,i,j);
                }
            }
        }
        return res;


        
        
    }
    public static void dfs(boolean [][]visited,int [][]matrix,int i,int j)
    {
        visited[i][j]=true;
         int []dir={0,1,0,-1,0};
        for(int k=0;k<4;k++)
        {
            int newRow=i+dir[k];
            int newCol=j+dir[k+1];
            if(newRow>=0&&newRow<matrix.length&&newCol>=0&&newCol<matrix[0].length&&matrix[newRow][newCol]==1&&visited[newRow][newCol]==false)
            {
                dfs(visited,matrix,newRow,newCol);
            }
        }
    }
}