class Solution {
    public int pivotInteger(int n) {
        if(n==1)
        {
            return 1;
        }
        int total=(n*(n+1))/2;
        int sum=0;
        int prev=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
            if(sum==(total-prev))
            {
                return i;

            }
            prev=sum;
        }
        return -1;


        
    }
}