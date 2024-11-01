class Solution {
    public String makeFancyString(String s) {
        StringBuilder st=new StringBuilder();
        int right=0;
        st.append(s.charAt(right));
        right++;
        while(right<s.length())
        {
            if(s.charAt(right)==s.charAt(right-1))
            {
                st.append(s.charAt(right));
                right++;
                while(right<s.length()&&s.charAt(right)==s.charAt(right-1))
                {
                    right++;
                }
            }
            else
            {
                  st.append(s.charAt(right));
                  right++;
            }

        }
        return st.toString();

        
    }
}