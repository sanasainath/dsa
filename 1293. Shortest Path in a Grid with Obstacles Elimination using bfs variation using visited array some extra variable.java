class Pair {
    int row;
    int col;
    int count;
    int kk;

    Pair(int row, int col, int count,int kk) {
        this.row = row;
        this.col = col;
        this.count = count;
        this.kk=kk;
    }
}

class Solution {
    public int shortestPath(int[][] grid, int k) {
         int n = grid.length;
        int m = grid[0].length;
        int mini = Integer.MAX_VALUE;
    Queue<Pair> q = new PriorityQueue<>((a, b) -> a.count - b.count);

        q.offer(new Pair(0, 0, 0,k));
        boolean[][][] visited = new boolean[n][m][k+1];
        visited[0][0][k] = true;
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            int row = pair.row;
            int col = pair.col;
            int kk=pair.kk;
          
            int count = pair.count;
            
            if (row == n - 1 && col == m - 1) {
                mini = Math.min(mini, count);
                continue;
            }
            int[] rows = { -1, 0, 1, 0 };
            int[] cols = { 0, 1, 0, -1 };

            for (int z = 0; z < 4; z++) {
                int newrow = row + rows[z];
                int newcol = col + cols[z];

                if (newrow >= 0 && newcol >= 0 && newrow < n && newcol < m && !visited[newrow][newcol][kk]) {
                    if (grid[newrow][newcol] == 1&&kk>0) {
                           visited[newrow][newcol][kk] = true;
                        q.offer(new Pair(newrow, newcol, count + 1,kk-1));
                    } else if (grid[newrow][newcol] == 0) {
                             visited[newrow][newcol][kk] = true;
                        q.offer(new Pair(newrow, newcol, count+1,kk));
                    }
                     
                }
            }
        }
        return mini==Integer.MAX_VALUE?-1:mini;


        
    }
}