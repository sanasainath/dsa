class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][]=new int[triangle.size()][triangle.size()];
        for(int []d:dp)
        {
            Arrays.fill(d,-1);
        }
        return path(triangle,0,0,dp);
        }
        public static int path(List<List<Integer>>li,int i,int j,int [][]dp)
        {
        if(i==li.size()-1)
        {
            return li.get(i).get(j);
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int x=path(li,i+1,j,dp)+li.get(i).get(j);
        int y=path(li,i+1,j+1,dp)+li.get(i).get(j);
        return dp[i][j]=Math.min(x,y);
        

        }
}