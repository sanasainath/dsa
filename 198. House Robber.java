// class Solution {
//     public int rob(int[] nums) {
//         int n=nums.length;
//     	int dp[]=new int[n];
// 			Arrays.fill(dp,-1);
//         return money(nums,n-1,dp);
        
//     }
//     public static int money(int []nums,int n,int []dp)
//     {
        
//       if(n==0)
//       {
//           return nums[n];
//       }
//       if(n<0)
//       {
//           return 0;

//       }
//       if(dp[n]!=-1)
//       {
//           return dp[n];
//       }
//       int left=nums[n]+money(nums,n-2,dp);
//       int right=0+money(nums,n-1,dp);
//       return dp[n]= Math.max(left,right);
//     }
// }
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n];
dp[0]=nums[0];

    }
}
