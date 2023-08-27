import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i : nums) {
            if (!h.contains(i)) {
                h.add(i);
                a.add(i);
            }
        }

        for (int i = 0; i < a.size(); i++) {
            nums[i] = a.get(i);
        }

        return a.size();
    }
}
  
//optimized...


class Solution {
    public intremoveDuplicates(int[] nums) {
      
      int count=1;
      for(int i=1;i<nums.length;i++)
      {
          if(nums[i]!=nums[i-1])
          {
              nums[count]=nums[i];
              count++;
          }
      }
      return count;
    }
}