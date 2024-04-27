class Solution {
    public int findRotateSteps(String ring, String key) {
        int [][]dp=new int [ring.length()][key.length()];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
       return path(ring,key,0,0,dp);
        
        
    }
    public static int path(String ring,String key,int i,int j,int [][]dp)

    {
        if(j==key.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int maxi=Integer.MAX_VALUE;
        for(int k=0;k<ring.length();k++)
        {
            if(ring.charAt(k)==key.charAt(j))
            {
               int res=distance(i,k,ring.length())+1+path(ring,key,k,j+1,dp);
               maxi=Math.min(maxi,res);
                

            }
        }
        return dp[i][j]=maxi;
   
  

    }
    public static int distance(int i,int k,int size)
    {
        int x=Math.abs(i-k);
        int y=size-x;
        return Math.min(x,y);
    }


}