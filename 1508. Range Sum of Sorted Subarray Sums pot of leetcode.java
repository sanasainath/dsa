class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        final int MOD = 1000000007;
        int sum=0;
        int nn=(n*(n+1))/2;
        int []arr=new int[nn];
        int xx=0;
        for(int i=0;i<nums.length;i++)
        {
            int curr=0;
            for(int j=i;j<nums.length;j++)
            {
                curr+=nums[j];
                arr[xx++]=curr;

            }
        }
        Arrays.sort(arr);
        for(int i=left;i<=right;i++)
        {
            sum=(sum+arr[i-1])%MOD;
        }
        return sum;
        

    }
}