class Solution {
    public int longestSquareStreak(int[] nums) {
       
        // int []dp=new int [nums.length];//tle

        // Arrays.fill(dp,-1);
        // return path(nums,0,new ArrayList<>(),dp);
        HashSet<Integer>set=new HashSet<>();
 
        for(int i:nums)
        {
            set.add(i);
        }
        // Arrays.sort(nums);
        int maxi=0;

        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            int xx=nums[i];
            while(set.contains(xx))
            {

              
                long rr=(long)xx*xx;
                  count++;
                if(rr>Integer.MAX_VALUE)
                {
                    break;
                }
                xx=(int)rr;
            
            
              
            }
            maxi=Math.max(maxi,count);
        }
        return maxi<2?-1:maxi;
        
    }
    // public static int path(int []nums,int i,List<Integer>dl,int []dp)
    // {
    //     if(i==nums.length)
    //     {
    //         if(dl.size()>=2)
    //         {
    //             List<Integer>li=new ArrayList<>(dl);
    //             Collections.sort(li);
    //             int w=-1;
    //             for(Integer ii:li)
    //             {
    //                 if(w==-1)
    //                 {
    //                     w=ii;
                        
    //                 }
    //                 else
    //                 {
    //                     if(w*w!=ii)
    //                     {
    //                      return -1;
    //                     }
    //                     w=ii;
    //                 }
    //             }
    //             return li.size();

    //         }
    //         return -1;
    //     }
    //     if(dp[i]!=-1)
    //     {
    //         return dp[i];
    //     }
    //     dl.add(nums[i]);
    //     int xx=path(nums,i+1,dl,dp);
    //     dl.remove(dl.size()-1);a
    //     int yy=path(nums,i+1,dl,dp);
    //     return dp[i]=Math.max(xx,yy);
    // }
}