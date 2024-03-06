//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
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
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        int n=grid.length;
        int m=grid[0].length;
        boolean [][]visit=new boolean [n][m];
        int [][]res=new int[n][m];
        Queue<Node>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
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
                if(row>=0&&col>=0&&row<n&&col<m&&grid[row][col]==0&&!visit[row][col])
                {
                    
                          q.offer(new Node(row,col,d+1));
                    visit[row][col]=true;
                  
                }
            }
            
        }
        return res;
        
        
    }
}