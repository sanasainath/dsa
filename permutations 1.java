import java.util.ArrayList;
class Solution {
    private void per(int []nums,List<List<Integer>>ans,List<Integer>ds,boolean[]freq)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
             freq[i]=true;
             ds.add(nums[i]);
             per(nums,ans,ds,freq);
             ds.remove(ds.size()-1);
             freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean []freq=new boolean[nums.length];
        per(nums,ans,ds,freq);
        return ans;
    }
}