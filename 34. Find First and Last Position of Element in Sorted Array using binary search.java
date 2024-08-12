class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=first(nums,target);
        int last=last(nums,target);
        return new int[]{first,last};

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)
        //     {
        //         first=i;
        //         break;
        //     }
        // }
        //  for(int i=nums.length-1;i>=0;i--)
        // {
        //     if(nums[i]==target)
        //     {
        //         last=i;
        //         break;
        //     }
        // }
        // return new int[]{first,last};
        
    }
    public static int first(int []arr,int tar)
    {
        int low=0;int high=arr.length-1;
        int res=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==tar)
            {
                res=mid;
                high=mid-1;
            }
            else if(arr[mid]>tar)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;
    }
     public static int last(int []arr,int tar)
    {
        int low=0;int high=arr.length-1;
        int res=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==tar)
            {
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]>tar)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;
    }
}