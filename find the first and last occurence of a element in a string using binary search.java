class Solution {
    static int first(int []arr,int x)
    {
        int low=0;
        int high=arr.length-1;
        int front=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                front=mid;
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;;
            }
            else
            {
                high=mid-1;
            }
        }
        return front;
    }
      static int last(int []arr,int x)
    {
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
      int f=first(nums,target);
      if(f==-1)
      {
          return new int[]{-1,-1};
      }
      int l=last(nums,target);
      return new int[]{f,l};
    }
}