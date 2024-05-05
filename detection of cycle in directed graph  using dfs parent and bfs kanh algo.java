//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        //DFS
        // int []par=new int[V];
        // boolean []visited=new boolean[V];
        // for(int i=0;i<V;i++)
        // {
        //     if(!visited[i])
        //     {
        //         if(dfs(par,visited,adj,i)==true)
        //         {
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        //--------->BFS<---------
        Queue<Integer>q=new LinkedList<>();
        int []indegree=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int ii:adj.get(i))
            {
                indegree[ii]++;
            }
        }
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                q.offer(i);
            }
        }
        ArrayList<Integer>li=new ArrayList<>();
        while(!q.isEmpty())
        {
            int size=q.size();
            
            for(int i=0;i<size;i++)
            {
                int qq=q.poll();
                li.add(qq);
                 for(int ii:adj.get(qq))
            {
                indegree[ii]--;
                if(indegree[ii]==0)
                {
                    q.offer(ii);
                }
            }
            adj.get(qq).clear();
            }
           
        }
        if(li.size()!=V)
        {
            return true;
        }
        return false;
    }
    // public static boolean dfs(int []par,boolean []visited,ArrayList<ArrayList<Integer>> adj,int i)
    // {
    //     par[i]=1;
    //     visited[i]=true;
    //     for(int ii:adj.get(i))
    //     {
    //         if(!visited[ii])
    //         {
    //             if(dfs(par,visited,adj,ii)){
    //                 return true;
    //             }
                
    //         }
    //         else if(par[ii]==1)
    //         {
    //             return true;
    //         }
    //     }
    //     par[i]=0;
    //     return false;
    // }
}