
class Solution
{
    //Function to find number of strongly connected components in the graph.
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        boolean []visited=new boolean[V];
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(!visited[i])
            {
                 dfs(adj,st,i,visited);
                
            }
        }
       
           for(int i=0;i<V;i++)
        {
           li.add(new ArrayList<>());
        }
        reverse(li,adj,V);
        Arrays.fill(visited,false);
        int res=0;
        while(!st.isEmpty())
        {
            int xx=st.pop();
            if(!visited[xx])
            {
                ans(xx,li,visited);
                res++;
            }
            
            
            
            
            
            
        }
        return res;
    }
    public static void ans(int xx,ArrayList<ArrayList<Integer>>li,boolean []visited)
    {
        
        visited[xx]=true;
        for(Integer ii:li.get(xx))
        {
            if(!visited[ii])
            {
                ans(ii,li,visited);
            }
            
        }
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,Stack<Integer>st,int i,boolean []visited)
    {
        visited[i]=true;
  
        for(Integer ii:adj.get(i))
        {
            if(!visited[ii])
            {
                dfs(adj,st,ii,visited);
            }
        }
         st.push(i);
        
    }
    public static void reverse(ArrayList<ArrayList<Integer>> li,ArrayList<ArrayList<Integer>> adj,int V)
    {
       
          for(int i=0;i<V;i++)
        {
           
        
    
       for(Integer ii:adj.get(i))
       {
           li.get(ii).add(i);
           
       }
        }
    
    }
}