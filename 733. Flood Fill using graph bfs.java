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
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int n=image.length;
       int m=image[0].length;
       int [][]res=new int[n][m];
       int target=image[sr][sc];
        Queue<Node>q=new LinkedList<>();
        q.offer(new Node(sr,sc));
        int visit[][]=new int[n][m];
        
        int []rows={-1,0,+1,0};
        int []cols={0,+1,0,-1};
          while(!q.isEmpty())
          {
            Node node=q.poll();
            
            int r=node.x;
            int c=node.y;
            image[r][c]=color;
            visit[r][c]=color;
            for(int i=0;i<4;i++)
            {
                int row=r+rows[i];
                int col=c+cols[i];
                if(row>=0&&row<n&&col<m&&col>=0&&image[row][col]==target&&visit[row][col]!=color)
                {
                    q.offer(new Node(row,col));

                }
            }
          }
 return image;

        
    }
}