class Solution {
    public int sumOfMiddleElements(int[] arr1, int[] arr2) {
        int nn = arr1.length + arr2.length;
        int[] arr = new int[nn];
        int left = 0;
        int right = 0;
        int xx = 0;
        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] < arr2[right]) {
                arr[xx++] = arr1[left];
                left++;
            } else {
                arr[xx++] = arr2[right];
                right++;
            }
        }
        while (left < arr1.length) {
            arr[xx++] = arr1[left];
            left++;
        }
        while (right < arr2.length) {
            arr[xx++] = arr2[right];
            right++;
        }
        int sum = 0;
        if (nn % 2 == 0) {
            int mid = nn / 2;
            sum = arr[mid - 1] + arr[mid];
        } else {
            int mid = nn / 2;
            sum = arr[mid];
        }
        return sum;
    }
}
