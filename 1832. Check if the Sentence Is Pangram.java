class Solution {
    public boolean checkIfPangram(String sentence) {
      //my approach
        // HashMap<Character,Integer>mapp=new HashMap<>();
        // char c='a';
        // for(int i=0;i<26;i++)
        // {
        //     mapp.put(c,0);
        //     c++;
        // }
        // for(char ch:sentence.toCharArray())
        // {
        //   mapp.put(ch,mapp.getOrDefault(ch,0)+1);
        // }
        // for(Integer i:mapp.values())
        // {
        //     if(i==0)
        //     {
        //         return false;
        //     }

        // }
        // return true;
        //short way
        char c='a';
        for(int i=0;i<26;i++)
        {
            if(sentence.contains(String.valueOf(c)))
            {
                c++;
            }
            else
            {
                return false;
            }
        }
        return true;
        

        
    }
}