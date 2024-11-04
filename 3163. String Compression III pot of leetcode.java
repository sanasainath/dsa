class Solution {
    public String compressedString(String word) {
        StringBuilder st=new StringBuilder();
        int count=1;
        HashMap<Character,Integer>mapp=new HashMap<>();
        mapp.put(word.charAt(0),1);
        for(int i=1;i<word.length();i++)
        {
           if(!mapp.containsKey(word.charAt(i)))
           {
               for(Map.Entry<Character,Integer>entry:mapp.entrySet())
               {
                    if(entry.getValue()>9)
                    {
                        int xx=entry.getValue()/9;
                        while(xx>0)
                        {
                            st.append('9');
                            st.append(entry.getKey());
                            xx--;
                        }
                        if(entry.getValue()%9!=0)
                        {
                           st.append(entry.getValue()%9);
                          st.append(entry.getKey());
                        }
                        
                    }
                    else
                    {
                         st.append(entry.getValue());
                            st.append(entry.getKey());
                    }
               }
               mapp.clear();
           }
         
            mapp.put(word.charAt(i),mapp.getOrDefault(word.charAt(i),0)+1);
           
        }
         for(Map.Entry<Character,Integer>entry:mapp.entrySet())
               {
                    if(entry.getValue()>9)
                    {
                        int xx=entry.getValue()/9;
                        while(xx>0)
                        {
                            st.append('9');
                            st.append(entry.getKey());
                            xx--;
                        }
                        if(entry.getValue()%9!=0)
                        {
                           st.append(entry.getValue()%9);
                          st.append(entry.getKey());
                        }
                       
                        
                    }
                    else
                    {
                         st.append(entry.getValue());
                            st.append(entry.getKey());
                    }
               }
        return st.toString();



        
    }
}