class Solution {
    public boolean judgeSquareSum(int c) {
        if (c < 0)
            return false;

        // Normal case handling
        int start = 0;
        int end = (int) Math.sqrt(c);
        while (start <= end) {
            long summ =(long) (start) * (start) + (end * end);
            if (summ == c) {
                return true;
            } else if (summ < c) {
                start++;
            } else {
                end--;
            }
        }
        return false;
    }
}
