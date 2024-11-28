class Solution {
    public int myAtoi(String s) {
        // Your code here
        if(!s.matches(".*\\d.*"))
        {
            return 0;
        }
        
        StringBuilder st=new StringBuilder();
        boolean check=false;
        boolean zerocheck=false;
        for(char ch:s.toCharArray())
        {
            if(ch==' ')
            {
                continue;
            }
            else if(Character.isDigit(ch))
            {
                if(ch!='0')
                {
                    zerocheck=true;
                }
                st.append(ch);
                check=true;
            }
            else if(ch=='-'&&!check)
            {
                st.append(ch);
            }
            else if(ch=='0'&&zerocheck)
            {
                st.append(ch);
            }
            else
            {
                break;
            }
        }
        if(st.toString().isEmpty())
        {
            return 0;
        }
        if(st.toString().length()==1)
        {
            if(st.toString().charAt(0)=='-')
            {
                return 0;
            }
        }
        
        Long xx=Long.parseLong(st.toString());
        if(xx>Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        if(xx<Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        return xx.intValue();
        
        
    }
}