class Solution {
    public String[] divideString(String s, int k, char fill) {
     int c=s.length()%k;
     int n=0;
     if(c==0)
     {
        n=s.length()/k;
     }
     else
     {
        n=(s.length()/k);
        n=n+1;
     }
     String []arr=new String[n];
     int xx=0;
       for(int i=0;i<s.length();i=i+k)
       {
        if(i+k>s.length())
        {
            break;
        }
        String ss=s.substring(i,i+k);
        arr[xx++]=ss;
       }
       if(c==0)
       {
        return arr;
       }
       int diff=k-c;
       StringBuilder st=new StringBuilder();
       int nn=s.length()-1;
       while(c>0)
       {
        st.append(s.charAt(nn));
        c--;
        nn--;
       }
       st.reverse();
       while(diff>0)
       {
        st.append(fill);
        diff--;
       }
       arr[xx]=st.toString();
       return arr;


    }
}