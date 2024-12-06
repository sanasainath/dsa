class Solution {
    public boolean canChange(String start, String target) {
        if(start.equals(target))
        {
            return true;
        }
        String xx="";
        String yy="";
        for(int i=0;i<start.length();i++)
        {
            if(start.charAt(i)!='_')
            {
                  xx=xx+start.charAt(i);
            }
            if(target.charAt(i)!='_')
            {
                 yy=yy+target.charAt(i);
            }
          
           
        }
        if(!xx.equals(yy))
        {
            return false;
        }
        int n=start.length();
         int left=0;
         int right=0;
         if(target.charAt(0)=='R'&&start.charAt(0)!='R')
         {
            return false;
         }
           if(target.charAt(n-1)=='L'&&start.charAt(n-1)!='L')
           {
            return false;
           }
      
         while(left<n&&right<n)
         {
            while(left<n&&start.charAt(left)=='_')
            {
                left++;
            }
            while(right<n&&target.charAt(right)=='_')
            {
                right++;
            }
             if(left<n&&right<n&&start.charAt(left)!=target.charAt(right))
            {
                return false;
            }
            if(left<n&&right<n&&start.charAt(left)==target.charAt(right))
            {
               if(start.charAt(left)=='L'&&right>left)
               {
                return false;
               }
                if(start.charAt(left)=='R'&&right<left)
               {
                return false;
               }

       
                left++;
                right++;
            }

            

         }

         return true;
        
        
    }
}