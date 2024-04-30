import java.util.ArrayList;

class Solution {
    public long minEnd(int n, int x) {
        long ans = x;
        ArrayList<Long> v = new ArrayList<>();
        
        // Find positions where the bit is 0 in x
        for (int i = 0; i < 64; i++) {
            if (((1L << i)&x) == 0) {
                v.add((long)i);
            }
        }
        
        n -= 1;
        
        // Update ans based on bits in n and positions from v
       
        for (int i = 0; i < 64; i++) {
            if (((1L << i)&n) != 0) {
                ans += (1L << v.get(i));
            }
        }
        
        return ans;
    }
}
