
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        mergesort(0,arr.length-1,arr);
       return arr[k-1];
    }
    public static void mergesort(int low,int high,int []arr)
    {
        if(low>=high)
        {
            return;
        }
        int mid=(low+high)/2;
        mergesort(low,mid,arr);
        mergesort(mid+1,high,arr);
        merge(low,mid,high,arr);
    }
    public static void merge(int low,int mid,int high,int []arr)
    {
        int left=low;
        int right=mid+1;
        int []temp=new int[high-low+1];
        int xx=0;
        while(left<=mid&&right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp[xx++]=arr[left];
                left++;
            }
            else
            {
                temp[xx++]=arr[right];
                right++;
            }
            
        }
        while(left<=mid)
        {
            
              temp[xx++]=arr[left];
                left++;
        }
        while(right<=high)
        {
             temp[xx++]=arr[right];
                right++;
            
        }
        for(int i=0;i<temp.length;i++)
        {
            arr[i+low]=temp[i];
        }
    }
}