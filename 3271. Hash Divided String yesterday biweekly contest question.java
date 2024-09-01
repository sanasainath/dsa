class Solution {
    public String stringHash(String s, int k) {
         StringBuilder st=new StringBuilder();
        if(s.length()%k!=0)
        {
            return st.toString();
        }
        int n=s.length();
       String []arr=new String[n/k];
       int xx=0;
       for(int i=0;i<n;i=i+k)
       {
        arr[xx++]=s.substring(i,i+k);
       }
       
       for(String ss:arr)
       {
        int ans=0;
            char ch[]=ss.toCharArray();
            for(char cc:ch)
            {
               ans=ans+(cc-'a');
            }
            int result=ans%26;
            st.append((char)(result+'a'));

       }
       return st.toString();


    }
}