import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>li=new ArrayList<>();
         HashSet<Integer>set=new HashSet<>();
         for(int i=0;i<nums.length;i++)
         {
            if(set.contains(nums[i]))
            {
                li.add(nums[i]);
            }
            else
            {
                set.add(nums[i]);
            }
         }
        return li;
//const space
        //   List<Integer> duplicates = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        //     int index = Math.abs(nums[i]) - 1;
        //     if (nums[index] < 0) {
        //         duplicates.add(Math.abs(nums[i]));
        //     } else {
        //         nums[index] = -nums[index];
        //     }
        // }
        //  return duplicates;
    }
}