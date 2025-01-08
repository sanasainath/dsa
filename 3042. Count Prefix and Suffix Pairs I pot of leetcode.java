class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].length()>words[j].length())
                {
                    continue;
                }
                else
                {
                    if(words[j].startsWith(words[i]))
                    {
                        if(words[j].endsWith(words[i]))
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
        
    }
}