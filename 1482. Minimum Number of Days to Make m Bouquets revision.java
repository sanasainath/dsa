class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       if(m*k>bloomDay.length)
       {
        return -1;
       }
       int low=Integer.MAX_VALUE;
       int high=Integer.MIN_VALUE;
       for(int i=0;i<bloomDay.length;i++)
       {
        low=Math.min(low,bloomDay[i]);
        high=Math.max(high,bloomDay[i]);
       }
       while(low<high)
       {
        int mid=(low+high)/2;
        int xx=check(mid,bloomDay,k);
        if(xx>=m)
        {
            high=mid;
        }
        else{
            low=mid+1;
        }

       }
        return check(low, bloomDay, k) >= m ? low : -1;
    }
    public static int check(int mid,int []arr,int k)
    {
        int res=0;
        int count=0;
        for(int i:arr)
        {
            if(i<=mid)
            {
                count++;
                if(count==k)
                {
                    res++;
                    count=0;
                }
            }
            else
            {
             
             count=0;
            }
        }
       
        return res;
    }
}