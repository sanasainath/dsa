class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder st=new StringBuilder(number);
     for(int i=0;i<st.length()-1;i++)
     {
        if(st.charAt(i)==digit&&digit<st.charAt(i+1))
        {
            st.deleteCharAt(i);
            return st.toString();

        }
     }
     int l=st.lastIndexOf(String.valueOf(digit));
     if(l!=-1)
     {
        st.deleteCharAt(l);
     }
     return st.toString();
    }
}
