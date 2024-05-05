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
            int V = sc.nextInt();
            int E = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            List<Integer> safeNodes = obj.eventualSafeNodes(V, adj);
            for (int i : safeNodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        // Your code here
        //using bfs topological order
        List<List<Integer>>li=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            li.add(new ArrayList<>());
        }
        List<Integer>dl=new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            for(int ii:adj.get(i))
            {
                li.get(ii).add(i);
            }
        }
        int []indegree=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int ii:li.get(i))
            {
                indegree[ii]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                q.offer(i);
            }
        }
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int qq=q.poll();
                dl.add(qq);
                for(int ii:li.get(qq))
                {
                    indegree[ii]--;
                    if(indegree[ii]==0)
                    {
                        q.offer(ii);
                    }
                }
                li.get(qq).clear();
            }
        }
        Collections.sort(dl);
        return dl;
        
    }
}
