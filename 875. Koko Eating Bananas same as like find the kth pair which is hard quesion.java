class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1;
        int high=piles[piles.length-1];
        while(low<high)
        {
            int mid=(low+high)/2;
            int xx=check(piles,mid);
            if(xx<=h)
            {
                high=mid;
            }
            else if(xx>h)
            {
                low=mid+1;
            }
        }
        return low;
    }
    public static int check(int []arr,int mid)
    {
        int count=0;
        for(int i:arr)
        {
            count+=(int)Math.ceil((double)i/mid);
        }
        return count;
    }
}