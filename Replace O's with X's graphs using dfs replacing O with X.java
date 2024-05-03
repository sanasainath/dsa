//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        boolean [][]visited=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            if(a[i][0]=='O')
            {
                if(!visited[i][0])
                {
                    visited[i][0]=true;
                    path(visited,a,n,m,i,0);
                }
            }
            
            if(a[i][m-1]=='O')
            {
                if(!visited[i][m-1])
                {
                    visited[i][m-1]=true;
                    path(visited,a,n,m,i,m-1);
                }
            }
          
            
        }
        for(int j=0;j<m;j++)
        {
            
            if(a[0][j]=='O')
            {
                if(!visited[0][j])
                {
                    visited[0][j]=true;
                    path(visited,a,n,m,0,j);
                }
            }
            
            if(a[n-1][j]=='O')
            {
                if(!visited[n-1][j])
                {
                    visited[n-1][j]=true;
                    path(visited,a,n,m,n-1,j);
                }
            }
            
        }
        
      
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(!visited[i][j]&&a[i][j]=='O')
                {
                    a[i][j]='X';
                }
            }
        }
        return a;
    
    }
    public static void path(boolean[][] visited, char[][] a, int n, int m, int i, int j) {
    int[] row = {-1, 0, 1, 0};
    int[] col = {0, 1, 0, -1};
    
    for (int x = 0; x < 4; x++) {
        int nextrow = i + row[x];
        int nextcol = j + col[x];
        if (nextrow >= 0 && nextrow < n && nextcol >= 0 && nextcol < m) {
            if (a[nextrow][nextcol] == 'O' && !visited[nextrow][nextcol]) {
                visited[nextrow][nextcol] = true;
                path(visited, a, n, m, nextrow, nextcol); // Explore neighbors recursively
            }
        }
    }
}

  
}