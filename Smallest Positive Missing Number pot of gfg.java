class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        HashSet<Integer>set=new HashSet<>();
        int maxi=Integer.MIN_VALUE;
        for(int i:arr)
        {
            set.add(i);
            maxi=Math.max(maxi,i);
        }
        if(maxi<1)
        {
            return 1;
        }
        for(int i=1;i<maxi;i++)
        {
            if(!set.contains(i))
            {
                return i;
            }
        }
        return maxi+1;
    }
}
