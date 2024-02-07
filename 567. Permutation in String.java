import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int m = s2.length();
        if (s2 == null || m == 0 || k > m) {
            return false;
        }
        HashMap<Character, Integer> mapp = new HashMap<>();
        HashMap<Character, Integer> mapp2 = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char c = s1.charAt(i);
            mapp.put(c, mapp.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            char c = s2.charAt(i);
            mapp2.put(c, mapp2.getOrDefault(c, 0) + 1);
        }
        if (mapp.equals(mapp2)) {
            return true;
        }
        for (int j = k; j < m; j++) {
            char removeChar = s2.charAt(j - k);
            char newChar = s2.charAt(j);
            
            mapp2.put(newChar, mapp2.getOrDefault(newChar, 0) + 1);
            mapp2.put(removeChar, mapp2.get(removeChar) - 1);
            if (mapp2.get(removeChar) == 0) {
                mapp2.remove(removeChar);
            }
            
            if (mapp.equals(mapp2)) {
                return true;
            }
        }
        return false;
    }
}
