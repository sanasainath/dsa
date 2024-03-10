class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
     
        for(int i:nums1)
        {
            mapp.put(i,mapp.getOrDefault(i,0)+1);
        }
        int k=0;
        HashSet<Integer>set=new HashSet<>();
        
        for(int j:nums2)
        {
            if(mapp.containsKey(j))
            {
            set.add(j);
                

            }
        }
        int []res=new int[set.size()];
        int z=0;
        for(int a:set)
        {
            res[z++]=a;

        }
        return res;

    }
}