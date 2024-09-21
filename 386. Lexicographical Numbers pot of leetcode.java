class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>li=new ArrayList<>();
        if(n==0)
        {
            return li;
        }
        if(n==1)
        {
            li.add(1);
            return li;
        }

        for(int i=1;i<=n;i++)
        {
          li.add(i);
        }
        Collections.sort(li,(a,b)->String.valueOf(a).compareTo(String.valueOf(b)));
        return li;
        

        
    }
}