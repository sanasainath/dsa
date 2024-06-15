class Solution {
    public int findChampion(int n, int[][] edges) {
        boolean xx[]=new boolean[n];
        for(int i=0;i<edges.length;i++)
        {
            xx[edges[i][1]]=true;
        }
        int count=0;
        int res=0;
        for(int i=0;i<xx.length;i++)
        {
            if(!xx[i])
            {
                res=i;
                count++;
            }

        }
        if(count==1)
        {
           return res;
        }
        return -1;
        
    }
}