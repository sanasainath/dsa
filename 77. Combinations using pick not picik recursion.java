class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>li=new ArrayList<>();
         path(n,k,li,1,new ArrayList<>());
         return li;

        
    }
    public static void path(int n,int k,List<List<Integer>>li,int i,List<Integer>dl)
    {
        if(i==n+1)
        {
            if(dl.size()==k)
            {
                li.add(new ArrayList<>(dl));
                return;
            }
            return;
        }

        if(i>n+1)
        {
            return;
        }

        dl.add(i);
        path(n,k,li,i+1,dl);
        dl.remove(dl.size()-1);
        path(n,k,li,i+1,dl);
    }
}