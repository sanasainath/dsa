class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer>li=new ArrayList<>();
        if(time==0)
        {
            for(int i=0;i<security.length;i++)
            {
                li.add(i);
            }
            return li;
        }
        int []prefix=new int[security.length];
        prefix[0]=1;
        for(int i=1;i<security.length;i++)
        {
            if(security[i-1]>=security[i])
            {
                prefix[i]=prefix[i-1]+1;

            }
            else
            {
                prefix[i]=1;
            }
        }
        //suffix
        int []suffix=new int[security.length];
        suffix[0]=1;
        for(int i=1;i<suffix.length;i++)
        {
            if(security[i-1]<=security[i])
            {
                suffix[i]=suffix[i-1]+1;
            }
            else
            {
                suffix[i]=1;
            }
        }
        for(int i=0;i<security.length;i++)
        {
            if(i-time>=0&&i+time<security.length)
            {
                int diff=i-(i-time);
                if(prefix[i]-prefix[i-time]==diff)
                {
                    int newdiff=(i+time)-i;
                    if(suffix[i+time]-suffix[i]==newdiff)
                    {
                        li.add(i);
                    }
                }
            }
        }
        return li;
        



    }
}