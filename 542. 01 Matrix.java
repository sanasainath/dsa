class Solution {
      public class Node{
        int x;
        int y;
        int dis;
        public Node(int x,int y,int dis)
        {
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
      }
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        boolean [][]visit=new boolean [n][m];
        int [][]res=new int[n][m];
        Queue<Node>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    visit[i][j]=true;
                    q.offer(new Node(i,j,0));
                }
                
            }
            
        }
         int []nrow={-1,0,+1,0};
            int []ncol={0,+1,0,-1};
                while(!q.isEmpty())
        {
            Node node=q.poll();
            int r=node.x;
            int c=node.y;
           
            int d=node.dis;
            res[r][c]=d;
            for(int z=0;z<4;z++)
            {
                int row=r+nrow[z];
                int col=c+ncol[z];
                if(row>=0&&col>=0&&row<n&&col<m&&mat[row][col]==1&&!visit[row][col])
                {
                    
                          q.offer(new Node(row,col,d+1));
                    visit[row][col]=true;
                  
                }
            }
            
        }
        return res;
        
    }
}