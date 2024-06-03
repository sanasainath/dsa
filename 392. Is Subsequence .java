class Solution {
    public boolean isSubsequence(String s, String t) {
   
        
        int a = 0;
        int b = 0;
        
        while (b < t.length() && a < s.length()) {
            if (s.charAt(a) == t.charAt(b)) {
                a++;
            }
            b++;
        }
        
        return a == s.length();
    }
}
