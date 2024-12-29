class Solution {
    public String answerString(String word, int numFriends) {
        char c='a';
        for(char ch:word.toCharArray())
            {
                if(ch>c)
                {
                    c=ch;
                }
            }
        if(numFriends==1)
        {
            return word;
        }  
        int n=word.length();
        String res="";
        for(int i=0;i<word.length();i++)
            {
                char ch=word.charAt(i);
                if(ch==c)
                {
                    int d=n-i;
                    int len=Math.min(d,n-(numFriends-1));
                    String st=word.substring(i,i+len);
                    if(st.compareTo(res)>0)
                    {
                        res=st;
                    }
                }
                
            }
        return res;
    }
}