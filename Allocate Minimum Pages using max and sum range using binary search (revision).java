class Solution {
    // Function to find minimum number of pages.
    public static long findPages(int n, int[] arr, int m) {
        // Your code here
        if(arr.length<m)
        {
            return -1;
        }
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i:arr)
        {
            low=Math.max(low,i);
            high+=i;
        }
        while(low<high)
        {
            int mid=(low+high)/2;
            if(check(mid,arr,m))
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
            
        }
        return low;
    }
    public static boolean check(int mid,int []arr,int students)
    {
        int sum=0;
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>mid)
            {
                count++;
                sum=arr[i];
            }
        }
        if(count>students)
        {
            return false;
        }
        else if(count<=students)
        {
            return true;
        }
        return false;
    }
};