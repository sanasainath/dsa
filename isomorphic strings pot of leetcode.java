class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
    
HashMap<Character,Character>mapp=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(!mapp.containsKey(c))
            {
                 if(mapp.containsValue(d)) {
                  
                    return false;
                }
                mapp.put(c,d);
            }
            else
            {
                  char ch=mapp.get(c);
                  if(ch!=d)
                  {
                     return false;
                  }
            }

        }
        
        
        return true;
        
    }
  
}