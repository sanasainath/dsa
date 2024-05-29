
class Solution {
    
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
      Map<Integer, List<Integer>> mapp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if (!mapp.containsKey(nums[i])) {
            // If the key doesn't exist, create a new List for the key
            mapp.put(nums[i], new ArrayList<>());
        }
        // Add the value to the List associated with the key
        mapp.get(nums[i]).add(i);
        }
        int res[]=new int[queries.length];
        Arrays.fill(res,-1);
        for(int i=0;i<queries.length;i++)
        {
            if(!mapp.containsKey(x))
            {
                 res[i]=-1;

            }
            else
            {
                List<Integer>li=mapp.get(x);
                if(li.size()>=queries[i])
                {
                    res[i]=li.get(queries[i]-1);
                }
               
                
            }
           

        }
        return res;

        
        
    }
}