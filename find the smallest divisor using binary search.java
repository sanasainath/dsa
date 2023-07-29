import java.util.Arrays;
import java.util.*;
class Solution {
    static int func(int []arr)
    {
        Arrays.sort(arr);
        int n=arr.length-1;
        return arr[n];
    }
    static int function(int []num,int temp)
    {
        double sum=0;
        double y=temp;
        for(int i=0;i<num.length;i++)
        {
            double x=num[i];
          
            sum=sum+Math.ceil(x/y);

        }
        int z=(int)sum;
        return z;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int high=func(nums);
        int low=1;
        while(low<=high)
        {
            if(nums.length>threshold)
            {
                return -1;
            }
            int mid=(low+high)/2;
            
            int ans=function(nums,mid);
            if(ans<=threshold)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
        
    }
}