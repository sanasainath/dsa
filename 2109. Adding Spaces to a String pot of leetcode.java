class Solution {
    public String addSpaces(String s, int[] spaces) {
        int start=0;
       
        StringBuilder st=new StringBuilder();
        for(int i=0;i<spaces.length;i++)
        {
            int end=spaces[i];
            String ss=s.substring(start,end);
            start=spaces[i];
            st.append(ss);
         
            st.append(" ");
            
            
         
        }
        String res=s.substring(start,s.length());
        st.append(res);
        return st.toString();

        
    }
}