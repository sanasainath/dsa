class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            {
                st.push(ch);
            }
            else if(ch==')'&&!st.isEmpty())
            {
               st.pop();
            }
            else if(ch==')'&&st.isEmpty())
            {
                count++;

            }
        }
        return count+st.size();
        
    }
}