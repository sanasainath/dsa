class Solution {
    public int countSubstrings(String s) {
        int count=0;
        int [][]dp=new int[s.length()][s.length()];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
            if(check(i,j,s,dp)==1)
            {
                count++;
            }
                
                
                

            }
        }
        return count;
        
    }
    public static int check(int i,int j,String s,int [][]dp)
    {
        if(i>=j)
        {
             return 1;
        }
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
            if(s.charAt(i)==s.charAt(j))
            {
               return dp[i][j]=check(i+1,j-1,s,dp);
            }
            return dp[i][j]=0;
          
      
    }
}