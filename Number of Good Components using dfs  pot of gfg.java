//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++) mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int e;
            e = Integer.parseInt(br.readLine());

            int v;
            v = Integer.parseInt(br.readLine());

            int[][] edges = IntMatrix.input(br, e, 2);

            Solution obj = new Solution();
            int res = obj.findNumberOfGoodComponent(e, v, edges);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int findNumberOfGoodComponent(int e, int v, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=v;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        } 
        
        boolean  []visited=new boolean[v+1];
       visited[0]=true;
        int count=0;
        for(int i=1;i<=v;i++)
        {
            if(!visited[i])
            {
                int []xx={1};
                int []yy={0};
                dfs(visited,i,adj,xx,yy);
                if(((xx[0])*(xx[0]-1))/2==yy[0]/2)
                {
                    count++;
                }
            }
        }
        return count;
        
        
    }
    public static void dfs(boolean []visited,int i,ArrayList<ArrayList<Integer>>adj,int []xx,int []yy)
    {
        yy[0]+=adj.get(i).size();
        
        visited[i]=true;
        for(Integer ii:adj.get(i))
        {
            if(!visited[ii])
            {
                xx[0]++;
                dfs(visited,ii,adj,xx,yy);
            }
        }
    }
}
