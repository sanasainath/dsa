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
    public void solve(char[][] board) {
        Stack<Node>q=new Stack<>();
        int n=board.length;
        int m=board[0].length;
        int [][]res=new int[n][m];
        boolean [][]visit=new boolean[n][m];
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O') {
                visit[0][j] = true;
                q.push(new Node(0, j));
            }
        }

        // Store border data from the last row
        for (int j = 0; j < m; j++) {
            if (board[n - 1][j] == 'O') {
                visit[n - 1][j] = true;
                q.push(new Node(n - 1, j));
            }
        }

        // Store border data from the first column
        for (int i = 1; i < n - 1; i++) {
            if (board[i][0] == 'O') {
                visit[i][0] = true;
                q.push(new Node(i, 0));
            }
        }

        // Store border data from the last column
        for (int i = 1; i < n - 1; i++) {
            if (board[i][m - 1] == 'O') {
                visit[i][m - 1] = true;
                q.push(new Node(i, m - 1));
            }
        }
        int delrow[] = {-1, 0, +1, 0}; 
	    int delcol[] = {0, +1, 0, -1}; 
        while(!q.isEmpty())
        {
            Node node=q.pop();
            int r=node.x;
            int c=node.y;
            for(int z=0;z<4;z++)
            {
                int row=delrow[z]+r;
                int col=delcol[z]+c;
                if(row>=0&&col>=0&&row<n&&col<m&&!visit[row][col]&&board[row][col]=='O')
                {
                    q.push(new Node(row,col));
                    visit[row][col]=true;
                }
            }

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visit[i][j]&&board[i][j]=='O')
                {
                    board[i][j]='X';
                    visit[i][j]=true;
                }
            }
        }
 

        
    }
}