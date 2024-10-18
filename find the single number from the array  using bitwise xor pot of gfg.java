class Solution {
    int getSingle(int arr[]) {
        // code here
        int xx=0;
        for(int i:arr)
        {
            xx=xx^i;
        }
        return  xx;
    }
}