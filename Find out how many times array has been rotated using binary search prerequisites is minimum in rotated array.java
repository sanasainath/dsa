public class Solution {
    public static int findKRotation(int []arr){
        // Write your code here.
            int low=0;
            int high=arr.length-1;
            int ind=-1;
            int ans=Integer.MAX_VALUE;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(arr[low]<=arr[mid])
                {
                    
                    if(arr[low]<ans)
                    {
                        ans=arr[low];
                        ind=low;

                    }

                    low=mid+1;
                   
                }
                else
                {
                    if(arr[mid]<ans)
                    {
                        ans=arr[mid];
                        ind=mid;

                    }

                    high=mid-1;


                }
            }
            return ind;
    }
}