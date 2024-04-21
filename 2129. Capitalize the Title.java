class Solution {
    public String capitalizeTitle(String title) {
        String []str=title.split("\\s+");
        String []sss=new String[str.length];
        int i=0;
         for( String st:str)
         {
            if(st.length()==1||st.length()==2)
            {
                String ss=st.toLowerCase();
                sss[i]=ss;
                i++;
                

            }
            else
            {
               
                String tt=st.substring(0,1).toUpperCase();
                String ss=st.substring(1).toLowerCase();
                String res=tt+ss;
                sss[i]=res;
                i++;
            }
         }
         String result=String.join(" ",sss);
         return result;
        
    }
}