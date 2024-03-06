import java.util.List;
import java.util.Queue;
import java.util.*;
public class Solution {
     public  static class   Node{
        int x;
        int y;
        public Node(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    static class Graph {
        boolean detectCycle(int V, List<List<Integer>> adj) {
            //using bfs
            // Write your code here.
            // Queue<Node>q=new LinkedList<>();
            boolean []check=new boolean[V];
            // q.add(new Node(-1,1));
            // check[1]=true;
            // while(!q.isEmpty())
            // {
            //     Node node=q.poll();
            //     int parent=node.x;
            //     int child=node.y;
            //     for(int i:adj.get(child))
            //     {
            //         if(!check[i])
            //         {
            //             check[i]=true;
            //             q.add(new Node(child,i));
            //         }
            //         else if(parent!=i)
            //         {
            //             return true;
            //         }
            //     }

            // }
            // return false;
            //using dfs
          return path(check,adj,1,-1);

            
        }
        public static boolean path(boolean []visit,List<List<Integer>>adj,int child,int parent)
        {
            visit[child]=true;
            
            for(int i:adj.get(child))
            {
                if(!visit[i])
                {
                  if(path(visit, adj, i,child))
                  {
                      return true;
                  }
                }
                else if(i!=parent)
                {
                    return true;
                }
            }
            return false;

        }
            };
        }