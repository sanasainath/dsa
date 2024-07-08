class Solution {
    public static void path(List<Integer>li,int k,int i)
    {
        if(li.size()==1)
        {
            return;
        }
        int ii=(i+k-1)%li.size();
        li.remove(ii);
        path(li,k,ii);
    }
    public int findTheWinner(int n, int k) {
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            li.add(i+1);
        }
        path(li,k,0);
        return li.get(li.size()-1);
        
        
    }
}