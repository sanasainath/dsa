    class Solution {
        public int findTheCity(int n, int[][] edges, int distanceThreshold) {
            int [][]mat=new int[n][n];
        for(int []rows:mat)
        {
            Arrays.fill(rows,Integer.MAX_VALUE);
        }      
               for(int i=0;i<n;i++)
        {
            mat[i][i]=0;

        }
  
     
                for (int[] edge : edges) {
                mat[edge[0]][edge[1]] = edge[2];
                mat[edge[1]][edge[0]] = edge[2];
            }
        

       for (int k = 0; k < n; k++) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (mat[i][k] != Integer.MAX_VALUE && mat[k][j] != Integer.MAX_VALUE) {
                mat[i][j] = Math.min(mat[i][j], mat[i][k] + mat[k][j]);
            }
        }
    }
}

        int []res=new int[n];
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(i != j &&mat[i][j]<=distanceThreshold)
                {
                    count++;
                }
            }
            res[i]=count;
        }
        int result=-1;
        int maxi=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(res[i]<maxi||(res[i]==maxi&&i>result))
            {
                result=i;
                maxi=res[i];
            }
        }
    return result;
        
        }
    }