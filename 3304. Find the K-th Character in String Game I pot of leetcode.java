class Solution {
    public char kthCharacter(int k) {
        StringBuilder st=new StringBuilder();
        st.append("a");
        while(st.length()<k)
        {
           StringBuilder st1=new StringBuilder();
           for(int i=0;i<st.length();i++)
           {
             if(st.charAt(i)=='z')
             {
                st1.append('a');
             }
             else
             {
                char ch=(char)(st.charAt(i)+1);
                st1.append(ch);
             }
           }
           st.append(st1);
        }
        return st.charAt(k-1);
        
    }
}