class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0;int end=n-1;
        int maxi=Integer.MIN_VALUE;
        while(start<=end)
        {
            int mini=Math.min(height[start],height[end]);
        
            int cal=end-start;
            // int sub=Math.abs(cal);
            int area=mini*cal;
            maxi=Math.max(maxi,area);
            if(height[start]>=height[end])
            {
                end--;
            }
            else
            {
                start++;
            }
           


        }
        return maxi;
        
    }
}s