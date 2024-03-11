//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            
            int mat1[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat1[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int mat2[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat2[i][j] = Integer.parseInt(input[j]);
                }
            }
            
        
            
            Solution ob = new Solution();
            System.out.println(ob.countPairs(mat1,mat2,n,x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public class Node
    {
        int x;
        int y;
        public Node(int x,int y)
        {
            this.x=x;
             this.y=y;
        }
    }
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int count=0;
    HashMap<Integer,Node>mapp=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            mapp.put(mat2[i][j],new Node(i,j));
        }
    }
    for(int s=0;s<n;s++)
    {
        for(int t=0;t<n;t++)
        {
            int q=x-mat1[s][t];
            if(mapp.containsKey(q))
            {
                count++;
            }
        }
    }
    return count;
}
}