class Solution {
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        TreeSet<Integer>set=new TreeSet<>();

        for(int i=0;i<n;i++)
        {
            set.add(i);
        }
        List<Integer> results = new ArrayList<>();
        for(int []q:queries)
        {
            int start=q[0]+1;
            int end=q[1];
            SortedSet<Integer>sort=set.subSet(start,end);
            List<Integer>remove=new ArrayList<>(sort);
            set.removeAll(remove);
            
            results.add(set.size()-1);
        }
        int []res=new int[results.size()];
        for(int i=0;i<results.size();i++)
   {
        res[i]=results.get(i);
   }
   return res;
        
    }
}