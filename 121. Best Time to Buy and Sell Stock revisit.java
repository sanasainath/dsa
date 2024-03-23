class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int first=prices[0];
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            mini=Math.min(prices[i],mini);
            int res=prices[i]-mini;
            maxi=Math.max(res,maxi);
            
        }
        
        return maxi;
    }


}
