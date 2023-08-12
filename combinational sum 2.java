import java.util.ArrayList;
class Solution {
static void val(int index,int []arr,int x,List<List<Integer>>ans,List<Integer>ds)
{
    if(x==0)
    {
        ans.add(new ArrayList<>(ds));
        return;
    }
    for(int i=index;i<arr.length;i++)
    {
        if(i>index&&arr[i]==arr[i-1])
        {
            continue;
        }
        if(arr[i]>x)
        {
            break;
        }
        ds.add(arr[i]);
        val(i+1,arr,x-arr[i],ans,ds);
        ds.remove(ds.size()-1);
    }
}
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(candidates);
        val(0,candidates,target,ans,new ArrayList<>());
       return ans;
        
    }
}