class Solution {
    public int subsetXORSum(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
      return path(nums,0,new ArrayList<>());
    
    }   
    public static int path(int []nums,int i,List<Integer>li)
   {
    if(i==nums.length)
    {
     List<Integer>dl=new ArrayList<>(li);
     int val=0;
     for(int ii:li)
     {
        val=val^ii;
     }
     return val;
    }
    li.add(nums[i]);
    int xx=path(nums,i+1,li);
    li.remove(li.size()-1);
    int yy=path(nums,i+1,li);
    return xx+yy;
   } 
}