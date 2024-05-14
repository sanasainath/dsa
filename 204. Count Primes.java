import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        if(n<=1) {
            return 0;
        }
        boolean []xx = new boolean[n];
        Arrays.fill(xx, true);

        for(int i=2; i <=Math.sqrt(n); i++) {
            if(xx[i]) {
                for(int j=i*i; j<n; j=j+i) {
                    xx[j] = false;
                }
            }
        }
        int count = 0;
        for(int k=2; k<n; k++) {
            if(xx[k]) {
                count++;
            }
        }
        return count;
    }
}
