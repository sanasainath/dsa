class Solution {
    public int findChampion(int n, int[][] edges) {
        int []indegree=new int[n];
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            indegree[v]++;
        }
        int count=0;
        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                count++;
            }
        }
        if(count>1)
        {
            return -1;
        }
         for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
               return i;
            }
        }
        return -1;
        

        
    }
}