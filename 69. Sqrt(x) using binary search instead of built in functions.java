class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        int ans=-1;
        while(low<=high)
        
        {
            int mid=low+(high-low)/2;
            long sq=(long)mid*mid;
            if(sq<=x)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}