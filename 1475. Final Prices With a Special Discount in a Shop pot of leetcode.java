class Solution {
    public int[] finalPrices(int[] prices) {
        int []res=new int[prices.length];
        int xx=0;
        res[prices.length-1]=prices[prices.length-1];
        for(int i=0;i<prices.length-1;i++)
        {
            boolean check=false;
           for(int j=i+1;j<prices.length;j++)
           {
            if(prices[i]>=prices[j])
            {
                check=true;

                res[xx++]=prices[i]-prices[j];
                break;
            }
           }
           if(!check)
           {
            res[xx++]=prices[i];
           }
        }
        return res;
    }
}