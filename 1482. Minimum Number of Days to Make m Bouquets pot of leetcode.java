class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(m*k))
        {
            return -1;
        }
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++)
        {
            maxi=Math.max(maxi,bloomDay[i]);
            mini=Math.min(mini,bloomDay[i]);
        }
        int result=-1;
       while(mini<=maxi)
       {
        int mid=(mini+maxi)/2;

            if(binary(bloomDay,mid,m,k))
            {
                result=mid;
                maxi=mid-1;
            }
            else
            {
                mini=mid+1;
            }
        }
        return result;
        
    }
    public static boolean binary(int []bloom,int ii,int m,int k)
    {
        int count=0;
        int boq=0;
        for(int i=0;i<bloom.length;i++)
        {
            if(bloom[i]<=ii)
            {
                count++;
                if(count==k)
                {
                    boq++;
                     count=0;
                }
               
            }
            else
            {
                
               
                count=0;
            }


        }
       
      return boq>=m;
        

    }
}