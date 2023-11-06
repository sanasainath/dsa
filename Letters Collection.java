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
            String arr[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int mat[][] = new int[n][m];
            for(int i = 0;i < n;i++){
                String a[] = in.readLine().trim().split("\\s+");
                for(int j = 0;j < m;j++)
                    mat[i][j] = Integer.parseInt(a[j]);
            }
            int q = Integer.parseInt(in.readLine());
            int queries[][] = new int[q][3];
            for(int i = 0;i < q;i++){
                String a1[] = in.readLine().trim().split("\\s+");
                for(int j = 0;j < 3;j++)
                    queries[i][j] = Integer.parseInt(a1[j]);
            }
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.matrixSum(n, m, mat, q, queries);
            for(int i = 0;i < q;i++)
                System.out.println(ans.get(i));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
        // code here
        int ind;
        ind=0;
        int i,j;
        int sum;
        ArrayList<Integer> list=new ArrayList<>();
        while(q>0)
        {
            sum=0;
            int d=queries[ind][0];
            i=queries[ind][1];
            j=queries[ind][2];
            int data=mat[i][j];
            
            if((i-d)>=0) sum=sum+mat[i-d][j];
            if((i+d)<n) sum=sum+mat[i+d][j];
            if((j-d)>=0 ) sum=sum+mat[i][j-d];
            if((j+d)<m ) sum=sum+mat[i][j+d];
            if((i-d>=0) && (j-d>=0 )) sum=sum+mat[i-d][j-d];
            if((i-d>=0) && (j+d<m  )) sum=sum+mat[i-d][j+d];
            if((i+d<n) && (j-d>=0 )) sum=sum+mat[i+d][j-d];
            if((i+d<n) && (j+d<m )) sum=sum+mat[i+d][j+d];
            if(d==2)
            {
                if((i-d)>=0 && (j-1)>=0) sum=sum+mat[i-d][j-1];
                if((i-d)>=0 && (j+1)<m) sum=sum+mat[i-d][j+1];
                if((i-1)>=0 && (j+d)<m) sum=sum+mat[i-1][j+d];
                if((i+1)<n && (j+d)<m) sum=sum+mat[i+1][j+d];
                if((i+d)<n && (j+1)<m) sum=sum+mat[i+d][j+1];
                if((i+d)<n && (j-1)>=0) sum=sum+mat[i+d][j-1];
                if((i+1)<n && (j-d)>=0) sum=sum+mat[i+1][j-d];
                if((i-1)>=0 && (j-d)>=0) sum=sum+mat[i-1][j-d];
            }
            
            ind++;
            list.add(sum);
            q--;
            
        }
        
        return list;
    }
}