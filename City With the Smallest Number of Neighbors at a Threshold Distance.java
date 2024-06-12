//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] adj = new int[m][3];

            for (int i = 0; i < m; i++) {

                for (int j = 0; j < 3; j++) {
                    adj[i][j] = sc.nextInt();
                }
            }

            int dist = sc.nextInt();
            Solution obj = new Solution();
            int ans = obj.findCity(n, m, adj, dist);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
      int findCity(int n, int m, int[][] edges,int distanceThreshold)
      {
          //code here
          
          int [][]matrix=new int[n][n];
          for(int []rows:matrix)
          {
              Arrays.fill(rows,Integer.MAX_VALUE);
          }
          for(int i=0;i<n;i++)
          {
              matrix[i][i]=0;
              
          }
          for(int i=0;i<m;i++)
          {
              matrix[edges[i][0]][edges[i][1]]=edges[i][2];
              matrix[edges[i][1]][edges[i][0]]=edges[i][2];
          }
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              {
                  for(int k=0;k<n;k++)
                  {
                      if(matrix[j][i]!=Integer.MAX_VALUE&&matrix[i][k]!=Integer.MAX_VALUE&&matrix[j][k]>matrix[j][i]+matrix[i][k])
                      {
                          matrix[j][k]=matrix[j][i]+matrix[i][k];
                      }
                  }
              }
          }
          int countmin=Integer.MAX_VALUE;
          int city=-1;
          for(int i=0;i<n;i++)
          {
              int count=0;
              for(int j=0;j<n;j++)
              {
                  if(matrix[i][j]<=distanceThreshold)
                  {
                      count++;
                  }
              }
              if(count<countmin||(count==countmin&&i>city))
              {
                  city=i;
                  countmin=count;
                  
              }
          }
          return city;
          
      }
}
