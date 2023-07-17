class Solution {
    private void fun(int index,int[] arr,List<List<Integer>>ans,int target,List<Integer>li)
    {
        if(index==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(li));
            }
            return;

        }
        if(arr[index]<=target)
        {
            li.add(arr[index]);
            fun(index,arr,ans,target-arr[index],li);
            li.remove(li.size()-1);
        }
        fun(index+1,arr,ans,target,li);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        fun(0,candidates,ans,target,new ArrayList<>());
        return ans;
    }
}