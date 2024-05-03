//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Node{
    int x;
    int y;
    Node(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        Queue<Node>q=new LinkedList<>();
          for(int i=0;i<grid.length;i++)
        {
           if(grid[i][0]==1&&!visited[i][0])
           {
               visited[i][0]=true;
               
               q.offer(new Node(i,0));
           }
           if(grid[i][grid[0].length-1]==1&&!visited[i][grid[0].length-1])
           {
               visited[i][grid[0].length-1]=true;
               q.offer(new Node(i,grid[0].length-1));
           }
        }
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[0][j]==1&&!visited[0][j])
            {
                visited[0][j]=true;
                
                q.offer(new Node(0,j));
            }
            if(grid[grid.length-1][j]==1&&!visited[grid.length-1][j])
            {
                visited[grid.length-1][j]=true;
                q.offer(new Node(grid.length-1,j));
            }
        }
        
        int []row={-1,0,1,0};
        int []col={0,1,0,-1};
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node node=q.poll();
                int x=node.x;
                int y=node.y;
                for(int z=0;z<4;z++)
                {
                   int a=x+row[z];
                   int b=y+col[z];
                   if(a>=0&&a<grid.length&&b>=0&&b<grid[0].length)
                   {
                        if(grid[a][b]==1&&!visited[a][b])
                   {
                       visited[a][b]=true;
                       q.offer(new Node(a,b));
                   }
                       
                   }
                  
                }
                
            }
        }
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1&&!visited[i][j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}