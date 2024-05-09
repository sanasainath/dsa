class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        if(k==0)
        {
            return 0;
        }
        long sum=0;
        Arrays.sort(happiness);
        int count=0;
        for(int i=n-1;i>=0;i--)
        {
            if(k<=0)
            {
                break;
            }
             int xx=happiness[i]-count;
             if(xx<0)
             {
                xx=0;
             }
            sum=sum+(xx);
            k--;
            count++;

        }
        return sum;
        
    }
}