import java.util.Arrays;
class Solution {
    static int arr(int []pile)
    {
        Arrays.sort(pile);
        int x=pile.length;
        return pile[x-1];
    }
    static int func(int []piles,int hours)
    {
        double total=0;
        for(int i=0;i<piles.length;i++)
        {
            double x=piles[i];
            double r=hours;
            total=total+Math.ceil(x/r);
        }
        int z=(int)total;
        return z;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        
        int high=arr(piles);
        int max=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int hour=func(piles,mid);
            if(hour<=h)
            {
                max=Math.min(mid,max);
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return max;
        
    }
}