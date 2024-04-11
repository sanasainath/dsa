class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Character>st=new Stack<>();
         if (k >= num.length()) {
            return "0";
        }
       st.push(num.charAt(0));
       for(int i=1;i<num.length();i++)
       {
        // if(st.peek()<=num.charAt(i)||k==0)
        // {
        //     st.push(num.charAt(i));
        // }
        // else if(k>0)
        // {
        //     k--;
        //     st.pop();
        //     st.push(num.charAt(i));
        // }
         while(!st.isEmpty()&&k>0&&st.peek()>num.charAt(i))
         {
            k--;
            st.pop();
         }
         st.push(num.charAt(i));

       }
       while(k>0&&!st.isEmpty())
       {
            
                st.pop();
                k--;
             
       }
       StringBuilder str=new StringBuilder();
       if(st.isEmpty())
       {
        return "";
       }
       while(!st.isEmpty())
       {
        
        str.append(st.pop());

       }
       str.reverse();
      
    String res=str.toString();
// Find the index of the first non-zero digit
int kk=0;
for(kk=0;kk<res.length();kk++) {
    if(res.charAt(kk)!='0') {
        break;  
    }
}
// Return the substring from the first non-zero digit
return (kk == res.length()) ? "0" : res.substring(kk);

       



        
    }
}