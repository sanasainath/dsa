class Solution {
    public int compress(char[] chars) {
           StringBuilder st=new StringBuilder();
     
        HashMap<Character,Integer>mapp=new HashMap<>();
        mapp.put(chars[0],1);
        for(int i=1;i<chars.length;i++)
        {
           if(!mapp.containsKey(chars[i]))
           {
               for(Map.Entry<Character,Integer>entry:mapp.entrySet())
               {
                   if(entry.getValue()>1)
                   {
                         st.append(entry.getKey());
                   
                     st.append(entry.getValue());
                    
               
                   }
                   else
                   {
                        st.append(entry.getKey());

                   }
        
               }
               mapp.clear();
           }
         
            mapp.put(chars[i],mapp.getOrDefault(chars[i],0)+1);
           
        }
        for(Map.Entry<Character,Integer>entry:mapp.entrySet())
               {
                   if(entry.getValue()>1)
                   {
                         st.append(entry.getKey());
                   
                     st.append(entry.getValue());
                    
               
                   }
                   else
                   {
                        st.append(entry.getKey());

                   }
        
               }
               for (int j = 0; j < st.length(); j++) {
            chars[j] = st.charAt(j);
        }

         return st.length();
        
    }
}