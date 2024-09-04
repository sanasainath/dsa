class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        
        Arrays.sort(arr);
        if (arr[0] != 1) {
            return 1;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1])!=1)
            {
                return arr[i]+1;
            }
        }
        return n;
        
        //optimzed
          // Your Code Here
        int whole=n*(n+1)/2;
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        return whole-total;
    }
}