class Solution {
    public long maximumTotalSum(int[] maximumHeight) {
        long res=0;
        Arrays.sort(maximumHeight);
        int n=maximumHeight.length;
        int maxi=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--)
        {
           int val=maximumHeight[i];
           if(maxi>val)
           {
            maxi=val;
           }
           if(maxi==0)
           {
            return -1;
           }
           res+=maxi;
           maxi--;
        }
        return res;
        
    }
}
