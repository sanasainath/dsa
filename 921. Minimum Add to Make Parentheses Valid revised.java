class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        int count=0;
        if(s.length()==1)
        {
            return 1;   
        }
        for(char ch:s.toCharArray())
        {
            if(ch==')')
            {
                if(st.isEmpty())
                {
                    count++;
                }
                else if(!st.isEmpty()&&st.peek()=='(')
                {
                    st.pop();
                }
            }
            else
            {
                st.push(ch);
            }
        }
        count+=st.size();
        return count;

    }
}