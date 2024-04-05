class Solution {
    public String makeGood(String s) {
Stack<Character>st=new Stack<>();
String str="";
  for(char i:s.toCharArray())
  {
    if(!st.isEmpty()&&(st.peek()==(char)(i-32)||st.peek()==(char) (i + 32)))
      {
        st.pop();
      }
      else
      {
         st.push(i);
      }

      
      

  }

   StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }
        
        return result.toString();
        
    }
}