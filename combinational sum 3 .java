class Solution {
    private void fun(int k,int n,int target,int index,List<List<Integer>>ans,List<Integer>ds)
    {
    if(target>n)
    {
        return;
    }
    else
    {
           if(ds.size()==k)
            {
              if(target==n)
              {
                  ans.add(new ArrayList<>(ds));
              }
            }
        for(int i=index;i<=9;i++)
        {
            
            ds.add(i);
          fun(k,n,target+i,i+1,ans,ds);
           ds.remove(ds.size()-1);
        }
    }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        int target=0;
        int index=1;
        fun(k,n,target,index,ans,ds);
        return ans;
        
    }
}