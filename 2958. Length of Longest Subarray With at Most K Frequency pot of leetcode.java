// class Solution {
//     public int maxSubarrayLength(int[] nums, int k) {
//         int n=nums.length;
//       int left=0;int maxi=Integer.MIN_VALUE;
//       HashMap<Integer,Integer>mapp=new HashMap<>();
//        for(int right=0;right<n;right++)
//        {
//            mapp.put(nums[right],mapp.getOrDefault(nums[right],0)+1);
       
//         while(mapp.get(nums[right])>k)
//         {
//             mapp.put(nums[right],mapp.get(nums[right])-1);
//             left++;
//         }
//         maxi=Math.max(maxi,right-left+1);

          

//        }
   
//        return maxi;
        
//     }
  
// }
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxSubarrayLength(int[] v, int k) {
        int n = v.length;
        Map<Integer, Integer> m = new HashMap<>();
        int i = 0, j = 0, ans = 1;
        while (i < n && j < n) {
            m.put(v[j], m.getOrDefault(v[j], 0) + 1);
            while (m.get(v[j]) > k) {
                m.put(v[i], m.get(v[i]) - 1);
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
} 