class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
      if (n == 0) return 0;
        if (n == 1) return nums[0];


        int []arr1=new int[n-1];
        int []arr2=new int[n-1];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            arr1[j++]=nums[i];

        }
        j=0;
         for(int i=1;i<n;i++)
        {
            arr2[j++]=nums[i];

        }
        return Math.max(path(arr1,arr1.length),path(arr2,arr2.length));
    }
    public static int path(int []nums,int n)
    {
           if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
           
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
    }
}
