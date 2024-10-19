class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder st=new StringBuilder();
        StringBuilder st1=new StringBuilder();
        st.append('0');
        while(n>1)
        {
            st1.append(st);
            st1.append('1');
            st1.append(reverse(st));
            st.setLength(0);
            st.append(st1);
            st1.setLength(0);
            n--;


          
        }
        return  st.charAt(k-1);

        
    }
    public static String reverse(StringBuilder st)
    {
        StringBuilder check=new StringBuilder();
        for(char ch:st.toString().toCharArray())
        {
            if(ch=='0'){
                check.append('1');
            }
            else if(ch=='1')
            {
                check.append('0');
            }
        }
        return check.reverse().toString();

    }
}