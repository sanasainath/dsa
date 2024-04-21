class Solution {
    public int numberOfSpecialChars(String word) {
    HashMap<Character,Integer>mapp=new HashMap<>();
    int count=0;
    for(int i=0;i<word.length();i++)
    {
        if(Character.isUpperCase(word.charAt(i)))
        {
            if(!mapp.containsKey(word.charAt(i)))
            {
                mapp.put(word.charAt(i),i);

            }

        }
        else
        {
               mapp.put(word.charAt(i),i);

        }
     
    }
    HashSet<Character>set=new HashSet<>();
    for(char i:word.toCharArray())
    {
        set.add(i);
    }
    for(char ch:set)
    {
        if(Character.isLowerCase(ch))
        {
            int xx=mapp.get(ch);
            char cc=Character.toUpperCase(ch);
            if(mapp.containsKey(cc))
            {
                int zz=mapp.get(cc);
                if(zz>xx)
                {
                    count++;
                }
            }
        }
    }
    return count;
        
        
    }
}