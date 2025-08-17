class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
      long []prefix=new long[prices.length]; 
        long []suffix=new long[prices.length];
        long maxi=Long.MIN_VALUE;
        long prod=0;
            for(int i=0;i<prices.length;i++)
                {
                    long xx=prices[i]*strategy[i];
                   prod+=xx;
                    prefix[i]=prod;
                }
        maxi=Math.max(maxi,prod);
        prod=0;
            for(int i=prices.length-1;i>=0;i--)
                {
                    long xx=prices[i]*strategy[i];
                   prod+=xx;
                    suffix[i]=prod;
                }
        
       
       for(int i=0;i<prices.length-k+1;i++)
           {
                long value=0;
               int right=i+(k/2);
               while(right<i+k)
                   {
                    value+=prices[right];
                       right++;
                   }
               if(i==0)
               {
                   if(right==strategy.length)
                   {
                       maxi=Math.max(value,maxi);
                   }
                   else{
                       maxi=Math.max(maxi,value+suffix[right]); 
                   }
               }
               else if(right==strategy.length)
               {
                     maxi=Math.max(maxi,value+prefix[i-1]); 
               }
               else
               {
                     maxi=Math.max(maxi,prefix[i-1]+value+suffix[right]);
               }
             
           
           }
        return maxi;
        
    }
}
// 0 1 2 3 4 5 6 7  8
                          ©leetcode