class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
      
        ArrayList<Integer>li=new ArrayList<>();
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            li.add(arr[right]);
            li.add(arr[left]);
            left++;
            right--;
        }
          if (left == right) {
            li.add(arr[left]);
        }
        return li;
    }
}
