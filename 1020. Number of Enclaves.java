class Solution {
    public class Node{
        int x;
        int y;
        public Node(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public int numEnclaves(int[][] grid) {
     int n=grid.length;
     int m=grid[0].length;
     Queue<Node>st=new LinkedList<>();
     boolean [][]visit=new boolean[n][m];
     for(int j=0;j<m;j++){
        if(grid[0][j]==1)
        {
            st.offer(new Node(0,j));
            visit[0][j]=true;

        }
     }
     for(int j=0;j<m;j++){
        if(grid[n-1][j]==1)
        {
            st.offer(new Node(n-1,j));
            visit[n-1][j]=true;

        }
     }
     for(int i=1;i<n-1;i++)
     {
         if(grid[i][0]==1)
         {
           visit[i][0]=true;
         st.offer(new Node(i,0));
         }
         
     }
       for(int i=1;i<n-1;i++)
     {
         if(grid[i][m-1]==1)
         {
              visit[i][m-1]=true;
         st.offer(new Node(i,m-1));
         }
        
     }
     int delrow[] = {-1, 0, +1, 0}; 
	    int delcol[] = {0, +1, 0, -1}; 
     while(!st.isEmpty())
     {
         Node node=st.poll();
         int r=node.x;
         int c=node.y;
         for(int z=0;z<4;z++)
         {
             int row=r+delrow[z];
             int col=c+delcol[z];
             if(row>=0&&col>=0&&row<n&&col<m&&!visit[row][col]&&grid[row][col]==1)
             {
                 st.offer(new Node(row,col));
                 visit[row][col]=true;
             }
         }

     }
     int count=0;
     for(int a=0;a<n;a++)
     {
         for(int b=0;b<m;b++)
         {
             if(!visit[a][b]&&grid[a]a[b]==1)
             {
                 count++;

             }
         }
     }
     return count;
        
    }
}