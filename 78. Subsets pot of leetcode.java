class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>li=new ArrayList<>();
         path(li,nums,new ArrayList<>(),0);
         return li;

    }
    public static void path(List<List<Integer>>li,int []nums,List<Integer>dl,int i)
    {
        if(i==nums.length)
        {
            li.add(new ArrayList<>(dl));
            return;

        }
        dl.add(nums[i]);
        path(li,nums,dl,i+1);
        dl.remove(dl.size()-1);
          path(li,nums,dl,i+1);

        

    }
}