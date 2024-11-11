class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        Arrays.sort(arr);
        int count=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
              arr[i]++;
                
            }
            else if(arr[i]<arr[i-1])
            {
                count+=(Math.abs(arr[i]-arr[i-1]))+1;
                arr[i]+=(Math.abs(arr[i]-arr[i-1]))+1;
            }
        }
        return count;
    }
}