class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder st=new StringBuilder();
        String ss="";
        char []ch=date.toCharArray();
        for(char cc:ch)
        {
            if(cc=='-')
            {
                int xx=Integer.parseInt(ss);
                String bin=Integer.toBinaryString(xx);
                st.append(bin);
                st.append('-');
                ss="";
            }
            else
            {
                   ss=ss+cc;
            }
          
            
            
        }
        if(!ss.isEmpty())
        {
            int xx=Integer.parseInt(ss);
                String bin=Integer.toBinaryString(xx);
                st.append(bin);
            
        }
        return st.toString();
        
    }
}