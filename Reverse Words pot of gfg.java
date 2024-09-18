Reverse Words

Given a String str, reverse the string without reversing its individual words. Words are separated by dots.

Note: The last character has not been '.'. 

Examples :

Input: str = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i
Input: str = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole string , the input string becomes mno.pqr
Expected Time Complexity: O(|str|)
Expected Auxiliary Space: O(|str|)

Constraints:
1 <= |str| <= 105

class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        StringBuilder st=new StringBuilder();
        StringBuilder one=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            if(ch=='.')
            {
                
                st.append(one.reverse());
                st.append('.');
                one.setLength(0);
            }
            else
            {
                one.append(ch);
            }
          
            
        }
          st.append(one.reverse());
              
        return st.toString();
    }
}