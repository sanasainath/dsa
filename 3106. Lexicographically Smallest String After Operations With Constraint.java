class Solution {
    public String getSmallestString(String s, int k) {
        if(k==0)
        {
            return s;
        }
        StringBuilder st=new StringBuilder(s);
        for(int i=0;i<st.length();i++)
        {
         
          int dis=Math.min(st.charAt(i)-'a','z'-st.charAt(i)+1);
            if(dis<=k)
            {

              st.setCharAt(i,'a');
              k=k-dis;

            }
            else
            {
                st.setCharAt(i,(char)(s.charAt(i)-k));
                k=0;
            }
        }
        return st.toString();

        
    }
}