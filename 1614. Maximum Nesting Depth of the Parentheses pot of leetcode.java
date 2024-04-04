class Solution {
    public int maxDepth(String s) {
        Stack<Character>st=new Stack<>();
        int n=s.length();
        int count=0;
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
                maxi=Math.max(maxi,count);
                
                 st.push('(');
            }
            else if(s.charAt(i)==')')
            {
                if(!st.isEmpty()&&st.peek()=='(')
{
       count--;
                   st.pop();

}

             
               
            }
            
           
        }
        if(!st.isEmpty())
        {
return -1;
        }
        return maxi;
        

        
    }
}