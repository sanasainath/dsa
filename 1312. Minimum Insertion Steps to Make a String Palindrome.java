class Solution {
    public int minInsertions(String s) {
       
        int n=s.length();
         String reversed = new StringBuilder(s).reverse().toString();
        
        int []dp= new int[n+1];
        Arrays.fill(dp,0);



    for(int a=1;a<=n;a++)
    {
        int []dp1=new int[n+1];
        for(int b=1;b<=n;b++)
        {
            if(s.charAt(a-1)==reversed.charAt(b-1))
            {
                dp1[b]=1+dp[b-1];
            }
            else
            {
                   int x=dp[b];
            int y=dp1[b-1];
            dp1[b]=Math.max(x,y);
            }
          
        }
        dp=dp1;
    }
    return n-dp[n];
       
}
}