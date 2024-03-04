import java.util.Arrays;
public class Solution {
    public static int canYouMake(String s1, String s2) {
        // Write your code here.

       int n=s1.length();
        int m=s2.length();
       
        int []dp=new int[m+1];
        Arrays.fill(dp,0);



    for(int a=1;a<=n;a++)
    {
        int []dp1=new int[m+1];
        for(int b=1;b<=m;b++)
        {
            if(s1.charAt(a-1)==s2.charAt(b-1))
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
    int second=m-dp[m];
    return first+second;

    }
}