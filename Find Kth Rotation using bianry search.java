class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int low=0;
        int high=arr.size()-1;
        int maxi=Integer.MAX_VALUE;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr.get(low)<=arr.get(mid))
            {
                // maxi=Math.min(low,maxi);
                if(arr.get(low)<=maxi)
                {
                    maxi=arr.get(low);
                    ans=low;
                }
                low=mid+1;
            }
            else
            {
                 if(arr.get(mid)<=maxi)
                 
                 {
                    maxi=arr.get(mid);
                    ans=mid;   
                 }
              
                high=mid-1;
            }
            
        }
        return ans;
    }
}