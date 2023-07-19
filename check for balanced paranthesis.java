class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<Character>();
        for(char i:s.toCharArray())
        {
            if(i=='('||i=='{'||i=='[')
            {
                st.push(i);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                
                    char top=st.pop();

                if((i==')' && top=='(')||(i=='}' && top=='{')||(i==']' && top=='['))
                {
                    continue;
                }
                else
                {return false;
                }
            }
        }
        return st.isEmpty();
    }
}