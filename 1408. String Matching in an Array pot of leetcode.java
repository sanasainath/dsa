class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>li=new ArrayList<>();
        HashSet<String>set=new HashSet<>();

        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    if(words[j].contains(words[i]))
                    {
                        set.add(words[i]);
                    }
                }
            }
        }
        for(String ss:set)
        {
            li.add(ss);
        }
        return li;
    }
}