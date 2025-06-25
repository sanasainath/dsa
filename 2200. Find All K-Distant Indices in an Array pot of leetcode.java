class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> li = new ArrayList<>();
        int main = -1;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                main = i;
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                main = i;
            } else {
                int diff = Math.abs(i - main);
                if (diff > k) {
                    arr[i] = -1;
                }
            }

        }
        for (int i = nums.length-1; i >= 0; i--) {
             if (nums[i] == key) {
                    main = i;
                }
            else if (arr[i] == -1) {
               
                    int diff = Math.abs(i - main);
                    if (diff <=k) {
                        arr[i] = 0;
                    }
                

            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                li.add(i);
            }
        }
        return li;

    }
}
//  0 1 2 3 4 5 6 7 8 9 10
//  2 1 2 3 4 2 6 7 2 9 2
//  0 0 0 0 1 0 0 1 0 0 0