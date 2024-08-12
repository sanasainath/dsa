class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor=-1;
        int ceil=-1;
        for(int num:arr)
        {
            if(num<=x&&num>floor)
            {
                floor=num;
            }
            if(num>=x&&(ceil>num||ceil==-1))
            {
                ceil=num;
                
            }
        }
        return new int[]{floor,ceil};
    }
}
