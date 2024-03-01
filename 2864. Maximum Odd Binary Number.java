class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        
for(int i=0;i<s.length();i++)
{
    if(s.charAt(i)=='1')
    {
        count++;
    }
}
int count1=s.length()-count;
StringBuilder st=new StringBuilder();
while(count!=1)
{
    st.append('1');
    count--;
}
while(count1!=0)
{
    st.append('0');
    count1--;
}
st.append('1');
return st.toString();


      
        
    }
}