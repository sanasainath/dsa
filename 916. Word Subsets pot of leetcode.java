class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String>li=new ArrayList<>();
        HashMap<Character,Integer>mapp=new HashMap<>();
        for(String str:words2)
        {
          int []alpha=new int[26];
          for(char ch:str.toCharArray())
          {
            alpha[ch-'a']++;
          }
           for(char ch:str.toCharArray())
          {
            if(!mapp.containsKey(ch))
            {
                mapp.put(ch,alpha[ch-'a']);
            }
            else
            {
                mapp.put(ch,Math.max(alpha[ch-'a'],mapp.get(ch)));
            }
          }

        }
        
        for(String str:words1)
        {
             HashMap<Character,Integer>mapp1=new HashMap<>();
            for(char ch:str.toCharArray())
            {
               if(mapp.containsKey(ch))
               {
                mapp1.put(ch,mapp1.getOrDefault(ch,0)+1);
               }
            }
            if(check(mapp,mapp1))
            {
                li.add(str);
            }
        }
        return li;

    }
    public static boolean check(HashMap<Character,Integer>mapp,HashMap<Character,Integer>mapp1)
    {
        for(Map.Entry<Character,Integer>entry:mapp.entrySet())
        {
            if(!mapp1.containsKey(entry.getKey()))
            {
                return false;
            }
            else if(mapp1.containsKey(entry.getKey()))
            {
                if(entry.getValue()>mapp1.get(entry.getKey()))
                {
                  return false;
                }
            }
        }
        return true;
    }
}