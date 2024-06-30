class Solution {
    public int lengthOfLIS(int[] nums) {
        // int [][]dp=new int[nums.length][nums.length+1];
        // for(int []row:dp)

        // {
        //     Arrays.fill(row,-1);
        // }

      
        // return path(nums,0,-1,dp);

        //binary search way makes less time complexity.............
       List<Integer>li=new ArrayList<>();

       li.add(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>li.get(li.size()-1))
            {
               li.add(nums[i]);

            }
            else
            {
                int val=binarysearch(li,0,li.size()-1,nums[i]);
                li.set(val,nums[i]);
            }

        }
        return li.size();
        

    }
    public static int binarysearch(List<Integer>li,int low,int high,int target)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(li.get(mid)==target)
            {
                return mid;
            }
            else if(li.get(mid)<target)
            {
                low=mid+1;

            }
            else
            {
                high=mid-1;
            }
        }
        return low;

    }
    // public static int path(int []nums,int i,int prev,int [][]dp)
    // {
    //     if(i==nums.length)
    //     {
    //         return 0;
    //     }
    //     if(dp[i][prev+1]!=-1)
    //     {
    //         return dp[i][prev+1];
    //     }
    //     int x=0;
    //     if(prev==-1||nums[i]>nums[prev])
    //     {
    //         x=1+path(nums,i+1,i,dp);

    //     }
    //     int y=path(nums,i+1,prev,dp);
    //      dp[i][prev+1]=Math.max(x,y);
    //      return dp[i][prev+1];
    // }

}