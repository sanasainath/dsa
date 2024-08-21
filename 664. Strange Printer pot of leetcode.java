class Solution {
    public int strangePrinter(String s) {
        int [][]dp=new int[s.length()][s.length()];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        return path(s,0,s.length()-1,dp);
        
    }
    public static int path(String s,int i,int j,int [][]dp)
    {
        //       if (i > j) {
        //     return 0;
        // }

        if(i==j)
        {
            return 1;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int maxi=Integer.MAX_VALUE;

        for(int k=i;k<j;k++)
        {
            int val=path(s,i,k,dp)+path(s,k+1,j,dp);
            maxi=Math.min(val,maxi);

        }
        dp[i][j]=maxi;
        if(s.charAt(i)==s.charAt(j))
        {
           dp[i][j]--;
        }
        return dp[i][j];
    }
}