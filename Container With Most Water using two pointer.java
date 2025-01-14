class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int maxi=Integer.MIN_VALUE;
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int mini=Math.min(arr[left],arr[right]);
            int val=mini*(right-left);
            maxi=Math.max(maxi,val);
            if(arr[left]<arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        if(maxi==Integer.MIN_VALUE)
        {
            return 0;
        }
        return maxi;
    }
}