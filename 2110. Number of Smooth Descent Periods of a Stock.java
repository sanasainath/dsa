class Solution {
    public long getDescentPeriods(int[] prices) {
        long res=prices.length;
        int []diff=new int[prices.length-1];
        for(int i=0;i<prices.length-1;i++)
        {
            diff[i]=prices[i]-prices[i+1];
        }
        int count=0;
        for(int i:diff)
        {
            if(i!=1)
            {
             res+=(long) count * (count + 1) / 2;
                count=0;
            }
            else
            {
                count++;
            }
        }
        if(count!=0)
        {
          res += (long) count * (count + 1) / 2;
        }

        return res;
        
    }
}