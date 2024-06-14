//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] edge = new int[m][2];
            for (int i = 0; i < m; i++) {
                edge[i][0] = sc.nextInt();
                edge[i][1] = sc.nextInt();
            }

            Solution obj = new Solution();
            int ans = obj.Solve(n, edge);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    static int parentroot(int node, int[] parent) {
        if (node == parent[node]) {
            return node;
        }
        parent[node] = parentroot(parent[node], parent); // Path compression
        return parent[node];
    }

    static void unionbyrank(int u, int v, int[] parent, int[] rank) {
        int parentU = parentroot(u, parent);
        int parentV = parentroot(v, parent);
        if (parentU == parentV) {
            return;
        }
        if (rank[parentU] < rank[parentV]) {
            parent[parentU] = parentV;
        } else if (rank[parentV] < rank[parentU]) {
            parent[parentV] = parentU;
        } else {
            parent[parentV] = parentU;
            rank[parentU]++;
        }
    }

    public int Solve(int n, int[][] edge) {
        int[] parent = new int[n];
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
     int count=0;
        for (int i = 0; i < edge.length; i++) {
            if(parentroot(edge[i][0],parent)==parentroot(edge[i][1],parent))
            {
                count++;
            }
            unionbyrank(edge[i][0], edge[i][1], parent, rank);
        }

     
        HashSet<Integer>set=new HashSet<>();
        for (int i = 0; i < n; i++) {
           set.add(parentroot(parent[i],parent));
        }
        if(set.size()-1<=count)
        {
            return set.size()-1;
            
        }
        return -1;
    
    }

    
}
