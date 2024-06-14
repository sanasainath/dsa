//{ Driver Code Starts


import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static PrintWriter ot;

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s[] = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            List<List<int[]>> list = new ArrayList<>();
            for (int i = 0; i < V; i++) list.add(new ArrayList<>());
            for (int i = 0; i < E; i++) {
                s = br.readLine().trim().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int c = Integer.parseInt(s[2]);
                list.get(a).add(new int[] {b, c});
                list.get(b).add(new int[] {a, c});
            }
            ot.println(new Solution().spanningTree(V, E, list));
        }
        ot.close();
    }
}
// } Driver Code Ends


// User function Template for Java
// we use parent node when we need to find the edges of the spanning tree...

             //this is using prim's algooooooooooooo...........................
// class Pair{
//     int weight;
//     int node;
//     int parent;
//     public Pair(int weight,int node,int parent)
//     {
//         this.weight=weight;
//         this.node=node;
//         this.parent=parent;
//     }
// }
// class Solution {
//     static int spanningTree(int V, int E, List<List<int[]>> adj) {
//         // Code Here.
//       PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));

//         pq.offer(new Pair(0,0,-1));
//         int sum=0;
//         boolean []visited=new boolean[V];
//         while(!pq.isEmpty())
//         {
//             Pair pair=pq.poll();
//             int weight=pair.weight;
//             int node=pair.node;
          
//             if(!visited[node])
//             {
                
            
//             visited[node]=true;
            
//             sum+=weight;
//             for( int[] ii:adj.get(node))
//             {
//                 if(!visited[ii[0]])
//                 {
//                     pq.offer(new Pair(ii[1],ii[0],node));
//                 }
                
                
//             }
//             }
            
//         }
//         return sum;
//     }
// }




               //this is using disjoint set method by using kruskals algo..............
                       class Solution {
                    static int parenttop(int par,int []parent)
                    {
                        if(par==parent[par])
                        {
                            return par;
                        }
                        int uu=parenttop(parent[par],parent);
                        parent[par]=uu;
                        return parent[par];
                        
                        
                    }
                    
                   static void disjointbyrank(int u,int v,int []parent,int []rank){
                        
                        int parentU=parenttop(u,parent);
                        int parentV=parenttop(v,parent);
                        if(parentU==parentV)
                        {
                            return;
                        }
                        if(rank[parentU]<rank[parentV])
                        {
                            parent[parentU]=parentV;
                            
                        }
                        else if(rank[parentV]<rank[parentU])
                        {
                            parent[parentV]=parentU;
                            
                        }
                        else
                        {
                            parent[parentV]=parentU;
                           rank[parentU]++;
                            
                            
                        }
                    }
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        int []parent=new int[V];
        int []rank=new int[V];
        for(int i=0;i<V;i++)
        {
            parent[i]=i;
            rank[i]=0;
        }
       
       ArrayList<int []>newadj=new ArrayList<>();
       for(int i=0;i<V;i++)
       {
             for(int []li:adj.get(i))
             {
                 newadj.add(new int[]{i,li[0],li[1]});
                 
             }
           
       }
       Collections.sort(newadj,(a,b)->Integer.compare(a[2],b[2]));
     
        int sum=0;
       
            for(int []edge:newadj)
            {
                int weight=edge[2];
                int source=edge[0];
                int des=edge[1];
                if(parenttop(source,parent)!=parenttop(des,parent))
                {
                    sum+=weight;
                    disjointbyrank(source,des,parent,rank);
                }
                
                
            }
            
        
        return sum;
    }
}
