import java.util.*;
class Solution {
    public String addSpaces(String s, int[] spaces) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:spaces)
        {
            set.add(i);
        }
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
          if(set.contains(i))
          {
            st.append(" ");
          }
          st.append(s.charAt(i));
        }
        return st.toString();
        
    }
}