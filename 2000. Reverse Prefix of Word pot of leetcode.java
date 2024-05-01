class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=word.indexOf(ch);
        StringBuilder st=new StringBuilder();
         for(int i=ind;i>=0;i--)
         {
            st.append(word.charAt(i));
         }
          String ss=st.toString()+word.substring(ind+1,word.length());
          return ss;


        
    }
}