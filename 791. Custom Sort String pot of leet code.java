import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public String customSortString(String order, String s) {
        StringBuilder str = new StringBuilder();
        LinkedHashMap<Character, Integer> mapp = new LinkedHashMap<>();
            for(char i:s.toCharArray())
            {
                mapp.put(i,mapp.getOrDefault(i,0)+1);
            }
            for(char j:order.toCharArray())
            {
               if(mapp.containsKey(j))
               {
                   int val=mapp.get(j);
                   for(int z=0;z<val;z++)
                   {
                        str.append(j);
                   }
                   
                   mapp.remove(j);
               }
              
            }
             Set<Character> keys = mapp.keySet();
              for (char key : keys) {
                  int val=mapp.get(key);
                  for(int z=0;z<val;z++)
                  {
                     str.append(key);
                  }
          
        }

            return str.toString();
        
    
    }
}
