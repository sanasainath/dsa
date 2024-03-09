class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashMap<Integer,Integer>mapp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mapp.put(nums1[i],mapp.getOrDefault(nums1[i],0)+1);

        }
        for(int j=0;j<m;j++)
        {
            if(mapp.containsKey(nums2[j]))
            {
                return nums2[j];
            }
        }
        return -1;
        
    }
}