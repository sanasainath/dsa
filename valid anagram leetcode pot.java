class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
         Map<Character, Integer> mapp = new HashMap<>();
      for(char i:s.toCharArray())
      {
         mapp.put(i,mapp.getOrDefault(i,0)+1);
      }
      for(char j:t.toCharArray())
      {
          mapp.put(j,mapp.getOrDefault(j,0)-1);
          if(mapp.get(j)==0)
          {
              mapp.remove(j);
          }
      }
      return mapp.isEmpty();
      
        
    }
}