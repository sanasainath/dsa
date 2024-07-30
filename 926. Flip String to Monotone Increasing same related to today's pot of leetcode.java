class Solution {
    public int minFlipsMonoIncr(String s) {
        
        int n=s.length();
        int []leftones=new int[n];
        int []rightzeroes=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
              leftones[i]+=sum;
               if(s.charAt(i)=='1')
               {
                 sum++;
               }
        }
        sum=0;
        for(int i=n-1;i>=0;i--)
        {
              rightzeroes[i]=sum;
               if(s.charAt(i)=='0')
               {
                 sum++;
               }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            ans=Math.min(ans,rightzeroes[i]+leftones[i]);

        }
return ans;
        

        
        
    }
}