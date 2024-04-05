class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
int next[]=new int[n+1];
    int cur[]=new int[n+1];
    
    for(int ind = n-1; ind>=0; ind --){
        for (int prev_index = ind-1; prev_index >=-1; prev_index --){
            
            int notTake = 0 + next[prev_index +1];
    
            int take = 0;
    
            if(prev_index == -1 || nums[ind] > nums[prev_index]){
                
                take = 1 + next[ind+1];
            }
    
            cur[prev_index+1] = Math.max(notTake,take);
        }
        next = cur.clone();
    }
    
    return cur[0];
//         int dp[][]=new int [n+1][n+1];
// //         for(int []row:dp)
// //         {
// //   Arrays.fill(row,-1);
// //         }
       
//         for(int ind = n-1; ind>=0; ind --){
//         for (int prev_index = ind-1; prev_index >=-1; prev_index --){
            
//             int notTake = 0 + dp[ind+1][prev_index +1];
    
//             int take = 0;
    
//             if(prev_index == -1 || nums[ind] > nums[prev_index]){
                
//                 take = 1 + dp[ind+1][ind+1];
//             }
    
//             dp[ind][prev_index+1] = Math.max(notTake,take);
            
//         }
//     }
    
//     return dp[0][0];
      
        // return path(nums,0,n,-1,dp);
        
    }
    // public static int path(int []nums,int i,int n,int prev,int [][]dp)
    // {
    //     if(i==n)
    //     {
    //         return 0;
    //     }
    //     if(dp[i][prev+1]!=-1)
    //     {
    //         return dp[i][prev+1];
    //     }
    //     int x=0;
    //      if(prev==-1||nums[i]>nums[prev])
    //      {
    //         x=1+path(nums,i+1,n,i,dp);
    //      }
    //      int y=path(nums,i+1,n,prev,dp);
    //       return dp[i][prev+1]=Math.max(x,y);
    // }
}