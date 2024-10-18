class Solution {
    public int countMaxOrSubsets(int[] nums) {
        HashMap<Integer,Integer>mapp=new HashMap<>();
        path(nums,0,mapp,new ArrayList<>());
        int maxi=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>entry:mapp.entrySet())
        {
           maxi=Math.max(entry.getKey(),maxi);
        }
        return mapp.get(maxi);
        
    }
    public static void path(int []nums,int i,HashMap<Integer,Integer>mapp,List<Integer>dl)
    {
       if(i==nums.length)
       {
        int xx=0;
        for(Integer ii:dl)
        {
            xx=xx|ii;
        }
        mapp.put(xx,mapp.getOrDefault(xx,0)+1);
        return;
       }
      dl.add(nums[i]);
      path(nums,i+1,mapp,dl);
      dl.remove(dl.size()-1);
         path(nums,i+1,mapp,dl);
      
    }
}


// class Solution {
//     public int countMaxOrSubsets(int[] nums) {
//         HashMap<Integer, Integer> mapp = new HashMap<>();
//         generateSubsets(nums, 0, 0, mapp);
        
//         int maxi = Integer.MIN_VALUE;
//         for (Map.Entry<Integer, Integer> entry : mapp.entrySet()) {
//             maxi = Math.max(entry.getKey(), maxi);
//         }
        
//         return mapp.get(maxi);
//     }

//     // This function explicitly generates all subsets
//     public void generateSubsets(int[] nums, int index, int currentOr, HashMap<Integer, Integer> mapp) {
//         if (index == nums.length) {
//             mapp.put(currentOr, mapp.getOrDefault(currentOr, 0) + 1);
//             return;
//         }

//         // Include the current element in the subset
//         generateSubsets(nums, index + 1, currentOr | nums[index], mapp);

//         // Exclude the current element from the subset
//         generateSubsets(nums, index + 1, currentOr, mapp);
//     }
// }
