class Solution {
    public int countOperations(int num1, int num2) {
        // If one of the numbers is already zero, return 0
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        int[] count = new int[1];
        // If one of the numbers is negative, return -1
        if (op(count, num1, num2) == -1) {
            return -1;
        }
        return count[0];
    }

    public static int op(int[] count, int num1, int num2) {
        if (num1 == num2) {
            count[0]++;
            return 0;
        }
        if (num1 > num2) {
            num1 = num1 - num2;
            count[0]++;
        } else {
            num2 = num2 - num1;
            count[0]++;
        }
        // If one of the numbers becomes negative, return -1
        if (num1 < 0 || num2 < 0) {
            return -1;
        }
        return op(count, num1, num2);
    }
}
