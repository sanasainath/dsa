import java.lang.Integer;

class Solution {
    public int divide(int dividend, int divisor) {
       

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long n = Math.abs((long) dividend);
        long m = Math.abs((long) divisor);
        long t = 0;
        long a = 0;

        for (int i = 31; i >= 0; i--) {
            if ((t + (m << i)) <= n) {
                t = t + (m << i);
                a = a | (1L << i);
            }
        }

        if (sign < 0) {
            a = -a;
        }

        if (a > Integer.MAX_VALUE || a < Integer.MIN_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) a;
        }
    }
}
