class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character>st=new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char c:s.toCharArray())
        {
            
                if(c=='(')
                {
                    st.push(c);
                    res.append(c);
                  
                }
                  
                
                
                

            
            else if(c==')')
            {
                if(!st.isEmpty()&&st.peek()=='(')
                {

                
                  res.append(c);
                st.pop();
                }
                
            }
            else
            {
                res.append(c);
            }
           
            
        }
      
        while(!st.isEmpty())
        {
           int index = res.lastIndexOf("(");
            res.deleteCharAt(index);
            st.pop();
                    

           
        }
            
        
        return res.toString();
        
    }
}