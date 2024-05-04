//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // add your code here
        //dfs
        // int []arr=new int[V];
        // Stack<Integer>st=new Stack<>();
        // int []visited=new int[V];
        // for(int i=0;i<V;i++)
        // {
        //     if(visited[i]==0)
        //     {
        //         dfs(arr,adj,i,visited,st);
        //     }
        // }
        // int xx=0;
        // while(!st.isEmpty())
        // {
        //     arr[xx]=st.pop();
        //     xx++;
        // }
        // return arr;
        
        //using bfsss
        int []arr=new int [V];
        int []indegree=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int ii:adj.get(i))
            {
                indegree[ii]++;
                
            }
            
        }
        Queue<Integer>q=new LinkedList<>();
        int qq=0;
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
                int x=q.poll();
                arr[qq++]=x;
                for(int ii:adj.get(x))
                {
                    indegree[ii]--;
                    if(indegree[ii]==0)
                    {
                        q.offer(ii);
                    }
                }
                  adj.get(x).clear();
            }
        }
        return arr;
       
    }
    // public static void dfs(int []arr,ArrayList<ArrayList<Integer>> adj,int i,int []visited,Stack<Integer>st)
    // {
    //     visited[i]=1;
    //     for(int ii:adj.get(i))
    //     {
    //         if(visited[ii]==0)
    //         {
    //             dfs(arr,adj,ii,visited,st);
    //         }
    //     }
    //     st.push(i);
        
    // }
}
