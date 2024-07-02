class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

      HashMap<Integer,Integer>mapp=new HashMap<>();
      List<Integer>li=new ArrayList<>();
      for(int i=0;i<nums1.length;i++)
      {
        mapp.put(nums1[i],mapp.getOrDefault(nums1[i],0)+1);
      }
      for(int j:nums2)
      {
        if(mapp.containsKey(j))
        {
            li.add(j);

            int xx=mapp.get(j);
            if(xx==1)
            {
                mapp.remove(j);

            }
            else
            {
                mapp.put(j,xx-1);
            }
        }
      }
      int []res=new int[li.size()];
      for(int ii=0;ii<li.size();ii++)
      {
        res[ii]=li.get(ii);


      }
      return res;
        
    }
}