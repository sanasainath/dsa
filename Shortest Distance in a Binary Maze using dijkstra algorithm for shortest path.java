//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Pair{
    int d;
    int r;
    int c;
    public Pair(int d ,int r, int c)
    {
        this.d=d;
        this.r=r;
        this.c=c;
    }
}
class Solution {

    int shortestPath(int[][] grid, int[] source, int[] destination) {

        // Your code here
        int n=grid.length;
        int m=grid[0].length;
        PriorityQueue<Pair>pq=new PriorityQueue<>((p,q)->p.d-q.d);
        int [][]dis=new int[n][m];
        for(int []ro:dis)
        {
            Arrays.fill(ro,Integer.MAX_VALUE);
        }
        pq.offer(new Pair(0,source[0],source[1]));
        while(!pq.isEmpty())
        {
           
            int size=pq.size();
            for(int i=0;i<size;i++)
            {
                
                Pair p=pq.poll();
                int d=p.d;
                int r=p.r;
                int c=p.c;
                if(r==destination[0]&&c==destination[1])
                {
                    return d;
                }
                 int []row={-1,0,1,0};
            int []col={0,1,0,-1};
                for(int ii=0;ii<4;ii++)
                {
                    int ro=row[ii]+r;
                    int co=col[ii]+c;
                    if(ro<0||co<0||ro>=n||co>=m||grid[ro][co]==0)
                    {
                        continue;
                    }
                    else
                    {
                        if(d+1<dis[ro][co])
                        {
                            dis[ro][co]=d+1;
                            pq.offer(new Pair(d+1,ro,co));
                        }
                    }

                }
                
            }
        }
        return -1;
    }
}
