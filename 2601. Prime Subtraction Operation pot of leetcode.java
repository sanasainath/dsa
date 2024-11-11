class Solution {
    public boolean primeSubOperation(int[] nums) {
        if(nums.length==1)
        {
            return true;
        }
       
    if(nums[0]>2)
    {
        int res=0;
      for(int i=2;i<nums[0];i++)
      {
         if(isPrime(i))
         {
            res=i;
         }
      }
      nums[0]=nums[0]-res;
    }
    if(nums[1]<=nums[0])
    {
        return false;
    }
    for(int i=2;i<nums.length;i++)
    {
       
                if(path(nums[i-2],nums[i-1],nums[i],nums,i-1)==false)
                {
                  return false;
                }
                
        
    
    }
    return true;

        
    }
    public static boolean path(int a,int b,int c,int []nums,int pos)
    {
        
  
        for(int i=b-1;i>=2;i--)
        {
         
          if(isPrime(i))
          {
            int xx=b-i;
            if(a<xx&&xx<c)
            {
                nums[pos]=xx;
                return true;
            }
          }

        }
        if(a<b&&b<c)
        {
            return true;
        }
        return false;
    }
    private static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}
}