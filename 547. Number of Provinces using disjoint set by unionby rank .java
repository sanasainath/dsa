class Solution {
    static int rootparent(int node,int []parent)
    {
        if(node==parent[node])
        {
            return node;
        }
        parent[node]=rootparent(parent[node],parent);
        return parent[node];
    }
    static void unionbyrank(int u,int v,int []parent,int []rank){
     int parentU=rootparent(u,parent);
     int parentV=rootparent(v,parent);
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
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int n=isConnected.length;
               int []parent=new int[n];
        int []rank=new int[n];
        for(int i=0;i<n;i++)
        {
            rank[i]=0;
            parent[i]=i;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1)
                {
                    unionbyrank(i,j,parent,rank);
                }
            }
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<parent.length;i++)
          {
            set.add(rootparent(parent[i],parent));
            
          }
          return set.size();

 
        
        
    }
}