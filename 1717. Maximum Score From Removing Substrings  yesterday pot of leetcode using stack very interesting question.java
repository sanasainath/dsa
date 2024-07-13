class Solution {
    public int maximumGain(String s, int x, int y) {
        int n=s.length();
        int res=0;
        boolean a=false;
        boolean b=false;
        if(x>y)
        {
            a=true;
        }
        else if(y>x)
        {
            b=true;
        }

        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(a==true&&!st.isEmpty()&&st.peek()=='a'&&s.charAt(i)=='b')
            {
                
                    st.pop();
                    res+=x;
                
               

            }
            else if(b==true&&!st.isEmpty()&&st.peek()=='b'&&s.charAt(i)=='a')
            {
                
                    st.pop();
                    res+=y;
                

            }
            else
            {
             
                st.push(s.charAt(i));
             
            
                
                
            }
            
        }
        StringBuilder ss=new StringBuilder();
        while(!st.isEmpty())
        {
            ss.append(st.pop());

        }
        String str=ss.reverse().toString();
        for(int i=0;i<str.length();i++)
        {
            if(a==false&&!st.isEmpty()&&st.peek()=='a'&&str.charAt(i)=='b')
            {
                
                    st.pop();
                    res+=x;
                
               

            }
            else if(b==false&&!st.isEmpty()&&st.peek()=='b'&&str.charAt(i)=='a')
            {
                
                    st.pop();
                    res+=y;
                

            }
            else 
            {
                 st.push(str.charAt(i));
                
            
          
                
                
            }

        }
        
        return res;
        // else
        // {
        //     a=true;
        // }
        // Stack<Character>st=new Stack<>();
        // for(int i=0;i<n;i++)
        // {
        //     if(s.charAt(i)!='a'&&s.charAt(i)!='b')
        //     {
        //         st.clear();
        //         continue;
        //     }
        //     else{
               

                
        //         if(!st.isEmpty()&&st.peek()=='b'&&s.charAt(i)=='a')
        //         {
        //             if(a==true&&(i!=n-1)&&s.charAt(i+1)=='b')
        //             {
        //                 st.pop();
        //                 res+=x;
        //             }
        //             else
        //             {
        //                  st.pop();
        //             res+=y;

        //             }
                   
        //         }
        //         else if(!st.isEmpty()&&st.peek()=='a'&&s.charAt(i)=='b')

        //         {

        //             if(b==true&&(i!=n-1)&&s.charAt(i+1)=='a')
        //             {
        //                 st.pop();
        //                 res+=y;
        //             }
        //             else
        //             {
        //                 st.pop();
        //                 res+=x;
        //             }
                    
        //         }
        //         else
        //         {
        //              st.add(s.charAt(i));

        //         }
             
        //     }
        // }
        // return res;
         
        
    }
}