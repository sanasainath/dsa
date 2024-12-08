class Solution {
    public int findMinimumTime(List<Integer> strength, int K) {
        List<List<Integer>>li=new ArrayList<>();
        boolean []visited=new boolean[strength.size()];
        path(li,new ArrayList<>(),strength,visited);
        int maxi=Integer.MAX_VALUE;
        for(List<Integer>xx:li)
        {
            int time=check(xx,K);
            maxi=Math.min(maxi,time);
        }
        return maxi;
        
    }
    public static int check(List<Integer>list,int k)
    {
        int X=1;
        int energy=0;
        int time=0;
        for(int i=0;i<list.size();i++)
        {
            time+=(int)Math.ceil((double)list.get(i)/X);
            X+=k;
        }
        return time;

    }
    public static void path(List<List<Integer>>li,List<Integer>dl,List<Integer>strength,boolean []visited)
    {
        if(dl.size()==strength.size())
        {
            li.add(new ArrayList<>(dl));
            return;
        }
        for(int i=0;i<strength.size();i++)
        {
            if(!visited[i])
            {
                  dl.add(strength.get(i));
            visited[i]=true;
            path(li,dl,strength,visited);
            visited[i]=false;
            dl.remove(dl.size()-1);
            }
          
        }
    }
}