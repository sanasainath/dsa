class Solution {
    public int getLucky(String s, int k) {
        
       
        StringBuilder st=new StringBuilder();
    
        for(char ch:s.toCharArray())
        {
            int cc=ch-'a'+1;
         
            String ss=Integer.toString(cc);
            st.append(ss);
          
         
          
        }
        // int sum=Integer.parseInt(st.toString()); we can't use this because the string is too large to convert it back to integer
            int sum = 0;
       for(char ch:st.toString().toCharArray())
       {
        sum=sum+(ch-'0');
       }
       if(k==1)
       {
        return sum;
       }

       
    
        while(k>1)
        {
                int val=0;
            while(sum!=0)
            {
                 val=val+sum%10;
                sum=sum/10;
               
            }
            sum=val;
           
            k--;
             
        }

        
        return sum;

        
    }
}