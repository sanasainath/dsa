class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
   
      int val=0;
      for(int i=0;i<nums1.length;i++)
      {
        val=val^nums1[i];
      }
        if(nums2.length%2==0)
        {
            val=0;
        }
      if(nums1.length%2!=0)
      {
        for(int i=0;i<nums2.length;i++)
        {
            val=val^nums2[i];
        }
      }
      return val;
        
    }
}