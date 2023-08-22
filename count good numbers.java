class Solution {
    public int countGoodNumbers(long n) {
        int MOD = 1000000007;

        long evenPositions = (n + 1) / 2; // Number of even positions
        long oddPositions = n / 2; // Number of odd positions

        long goodEvenDigits = 5; // 0, 2, 4, 6, 8
        long goodOddDigits = 4; // 2, 3, 5, 7

        long countEven = modPow(goodEvenDigits, evenPositions, MOD);
        long countOdd = modPow(goodOddDigits, oddPositions, MOD);

        long totalGoodNumbers = (countEven * countOdd) % MOD;

        return (int) totalGoodNumbers;
    }

    private long modPow(long base, long exponent, int MOD) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        return result;
    }
}
