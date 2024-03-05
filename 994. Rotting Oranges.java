class Solution {
    public class Node{
        int x;
        int y;
        int t;


         public Node(int x,int y,int t)
    {
    this.x=x;
    this.y=y;
    this.t=t;
    }
    }
   

   public int orangesRotting(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
   
    int[][] visit = new int[m][n];
    Queue<Node> q = new LinkedList<>();
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (grid[i][j] == 2) {
                q.offer(new Node(i, j, 0));
                visit[i][j] = 2;
            } else {
                visit[i][j] = 0;
            }
        }
    }
    int[] rows = {-1, 0, 1, 0};
    int[] cols = {0, 1, 0, -1};
    int maxi = 0;
    while (!q.isEmpty()) {
        Node node = q.poll();

        int x = node.x;
        int y = node.y;
        int p = node.t;
        
        for (int z = 0; z < 4; z++) {
            int nrow = x + rows[z];
            int ncol = y + cols[z];
            if (nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && visit[nrow][ncol] != 2 && grid[nrow][ncol] == 1) {
                q.offer(new Node(nrow, ncol, p + 1));
                visit[nrow][ncol] = 2;
            }
        }
        maxi = Math.max(maxi, p);
    }

    for (int e = 0; e < m; e++) {
        for (int r = 0; r < n; r++) {
            if (visit[e][r] != 2 && grid[e][r] == 1) {
                return -1;
            }
        }
    }
    return maxi;
}

}