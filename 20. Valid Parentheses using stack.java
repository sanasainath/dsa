class Solution {
    public boolean isValid(String s) {
        if(s.length()==1)
        {
            return false;
        }
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='('||ch=='['||ch=='{')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                else
                {
                    if(ch==']')
                    {
                        if(st.peek()!='[')
                        {
                            return false;
                        }
                        else
                        {
                            st.pop();
                        }

                    }
                    else if(ch=='}')
                    {

                        if(st.peek()!='{')
                        {
                            return false;
                        }
                        else
                        {
                            st.pop();
                        }
                    }
                    else if(ch==')')
                    {
                          if(st.peek()!='(')
                        {
                            return false;
                        }
                        else
                        {
                            st.pop();
                        }

                    }
                }
            }
        }
        if(!st.isEmpty())
        {
            return false;
        }
        return true;
        
    }
}