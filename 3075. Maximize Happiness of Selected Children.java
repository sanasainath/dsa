class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        int count=0;
        Arrays.sort(happiness);
        long sum=0;
        for(int i=n-1;i>=0;i--)
        {
            if(k<=0)
            {
                break;
            }
            happiness[i]-=count;
            if(happiness[i]<=0)
            {
                break;
            }
            sum+=happiness[i];
            count++;
            k--;

        }
        return sum;
       
        
    }
}