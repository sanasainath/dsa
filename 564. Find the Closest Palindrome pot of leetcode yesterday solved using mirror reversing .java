class Solution {
   
    public static void mirror(String firsthalf,List<Long>li,boolean oddlenn)
    {
        StringBuilder st=new StringBuilder(firsthalf);
        String pref=firsthalf;
        if(oddlenn)
        {
            st.deleteCharAt(st.length()-1);

        }
        String suffix=st.reverse().toString();
        li.add(Long.parseLong(pref+suffix));

    }
    public String nearestPalindromic(String n) {
        int len=n.length();
        long num=Long.parseLong(n);
        List<Long>li=new ArrayList<>();
        String prefix=n.substring(0,(len+1)/2);
        long secondcase=Long.parseLong(prefix)+1;
        long thirdcase=Long.parseLong(prefix)-1;
        String secondstring=Long.toString(secondcase);
        String thirdstring=Long.toString(thirdcase);
        mirror(secondstring,li,len%2==1);
        mirror(thirdstring,li,len%2==1);
        mirror(prefix,li,len%2==1);

        //edge cases like 1001 or 999
        li.add((long)Math.pow(10,len-1)-1);
         li.add((long)Math.pow(10,len)+1);
         long res=Long.MAX_VALUE;
         long near=0;

         for(Long ll:li)
         {
            if(ll!=num){
            long diff=Math.abs(ll-num);
            if(diff<res||diff==res&&ll<near)
            {
                res=diff;
                near=ll;
            }
            }
         }
         return Long.toString(near);

       

        
    }
}