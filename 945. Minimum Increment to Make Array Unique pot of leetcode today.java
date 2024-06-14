class Solution {
    public int minIncrementForUnique(int[] nums) {
        //tried own but giving tle 
    //   Arrays.sort(nums);
    //   HashSet<Integer>set=new HashSet<>();
    //   int moves=0;
    //   for(int i=0;i<nums.length;i++)
    //   {
    //     if(set.contains(nums[i]))
    //       {
    //         int xx=nums[i]+1;
    //         moves++;
    //         while(true)
    //         {
    //             if(!set.contains(xx))
    //             {
    //                 set.add(xx);

    //                 break;
    //             }
    //             xx++;
    //             moves++;
    //         }
           
    //       }
    //       else if(!set.contains(nums[i]))
    //       {
    //         set.add(nums[i]);
    //       }
          
    //   }
    //   return moves;

    //so optimized approach..
    Arrays.sort(nums);
    int count=0;
    for(int i=1;i<nums.length;i++)
    {
        while(nums[i]<=nums[i-1])
        {
            nums[i]=nums[i]+1;
            count++;
        }

    }
    return count;

        
    }
}