class Solution {
    public String makeFancyString(String s) {
        if(s.length()<3)
        {
            return s;
        }
        StringBuilder st=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                count=0;
                st.append(s.charAt(i));
            }
            else if(count<1)
            {
                   st.append(s.charAt(i));
              count++;
            }
        }
        int n=s.length()-1;
      
            st.append(s.charAt(n));
        

        return st.toString();
    }
}