import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        // HashMap<Integer, Integer> mapp = new HashMap<>();
        // for (int i : nums) {
        //     mapp.put(i, mapp.getOrDefault(i, 0) + 1);
        // }
        // for (Integer x : mapp.values()) {
        //     if (x > 1) {
        //         int key = getKeyFromValue(mapp, x);
        //         return key;
        //     }
        // }
        // return 0;
              boolean[] taken = new boolean[nums.length];
    for (int num : nums) {
      if (taken[num]) {
        return num;
      }
      taken[num] = true;
    }
    return 0;
    }

    // public static int getKeyFromValue(HashMap<Integer, Integer> hashMap, int value) {
    //     for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
    //         if (entry.getValue() == value) {
    //             return entry.getKey();
    //         }
    //     }
    //     return -1; // Value not found
    // }
}
