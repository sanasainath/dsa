class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V=graph.length;
        List<Integer>li=new ArrayList<>();
        boolean []visited=new boolean[V];
        boolean []path=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                dfs(visited,graph,path,i,li);
            }
            

        }
        Collections.sort(li);
        return li;

        
    }
    public static boolean dfs(boolean []visited,int [][]graph,boolean []path,int i,List<Integer>li)
    {
        visited[i]=true;
        path[i]=true;
        for(int ii:graph[i])
        {
            if(!visited[ii])
            {
            if(dfs(visited,graph,path,ii,li))
            {
                return true;
            }
            }
            else if(path[ii])
            {
                return true;

            }
      

        }
           path[i]=false;
                li.add(i); 
                return false;
    } 
}