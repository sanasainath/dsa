//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Pair {
    int fir;
    int sec;

    public Pair(int fir, int sec) {
        this.fir = fir;
        this.sec = sec;
    }
}

class Solution {

    public int[] shortestPath(int N, int M, int[][] edges) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int source = edges[i][0];
            int destination = edges[i][1];
            int weight = edges[i][2];
            adj.get(source).add(new Pair(destination, weight));
        }

        boolean[] visited = new boolean[N];
          int res[] = new int[N];
    for (int i = 0; i < N; i++) {
      res[i] = (int)(1e9);
    }
    // not working this
    // Arrays.fill(res,Integer.MAX_VALUE);

    res[0] = 0;


        // Perform DFS
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                path(visited, adj, i, st);
            }
        }

        // Update distances using Dijkstra's algorithm
       while(!st.isEmpty())
		{
		    int val=st.pop();
		    for(Pair pp:adj.get(val))
		    {
		        int value=pp.fir;
		        int distance=pp.sec;
		        int xx=distance+res[val];
		        
		        res[value]=Math.min(res[value],xx);
		        
		        
		    }
		    
		    
		}
		 for (int i = 0; i < N; i++) {
      if (res[i] ==1e9) res[i] = -1;
    }

        return res;
    }

    public static void path(boolean[] visited, ArrayList<ArrayList<Pair>> adj, int i, Stack<Integer> st) {
        visited[i] = true;
        for (Pair ii : adj.get(i)) {
            int ind = ii.fir;
            if (!visited[ind]) {
                path(visited, adj, ind, st);
            }
        }
        st.push(i);
    }
}
