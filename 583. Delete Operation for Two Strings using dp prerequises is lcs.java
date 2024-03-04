class Solution {
    public int minDistance(String word1, String word2) {
       
        int n=word1.length();
        int m=word2.length();
       
        int []dp=new int[m+1];
        Arrays.fill(dp,0);



    for(int a=1;a<=n;a++)
    {
        int []dp1=new int[m+1];
        for(int b=1;b<=m;b++)
        {
            if(word1.charAt(a-1)==word2.charAt(b-1))
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
    int first=n-dp[m];
    int second=m- dp[m];
    return first+second;
    
    }
}