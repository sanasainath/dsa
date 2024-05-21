class Solution {
    public int subsetXORSum(int[] nums) {
        
        return path(nums,0,0);
        
    }
    public static int path(int []nums,int i,int j)
    {
        if(i==nums.length)
        {
            return j;
        }
        int x=path(nums,i+1,nums[i]^j);
        int y=path(nums,i+1,j);
        return x+y;
    }
}