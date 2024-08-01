class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>li=new ArrayList<>();
        HashMap<Character,Integer>mapp=new HashMap<>();
         HashMap<Character,Integer>mapp1=new HashMap<>();
          if (s.length() < p.length()) {
            return li; // If s is shorter than p, no anagrams can be found
        }
        
        for(int i=0;i<p.length();i++)
        {
            mapp.put(p.charAt(i),mapp.getOrDefault(p.charAt(i),0)+1);
            mapp1.put(s.charAt(i),mapp1.getOrDefault(s.charAt(i),0)+1);
        }
        if(mapp.equals(mapp1))
        {
            li.add(0);
           
        }
        int left=0;
        int right=p.length();
        for(int i=right;i<s.length();i++)
        {
            if(mapp1.containsKey(s.charAt(left)))
            {
                if(mapp1.get(s.charAt(left))==1)
                {
                      mapp1.remove(s.charAt(left));
                }
                 else
            {
                mapp1.put(s.charAt(left),mapp1.get(s.charAt(left))-1);
            }
           
            }
           
                 mapp1.put(s.charAt(i),mapp1.getOrDefault(s.charAt(i),0)+1);
                 if(mapp.equals(mapp1))
                 {
                    li.add(left+1);
                 }

                 left++;

        }
        return li;

        
    }
}