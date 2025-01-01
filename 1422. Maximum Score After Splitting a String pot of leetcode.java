class Solution {
    public int maxScore(String s) {
      
        int []ones=new int[s.length()];

           for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                if(i==s.length()-1)
                {
                    ones[i]=ones[i]+1;
                }
                else
                {
                    ones[i]=ones[i]+ones[i+1]+1;
                }
            }
            else
            {
                  if(i==s.length()-1)
                {
                    ones[i]=ones[i];
                }
                else
                {
                    ones[i]=ones[i]+ones[i+1];
                }
            }
         
        }
       int maxi=Integer.MIN_VALUE;
        int zeroes=0;
        for(int i=0;i<s.length()-1;i++)
        {
           char ch=s.charAt(i);
           if(ch=='0')
           {
            zeroes++;
           }
           int res=zeroes+ones[i+1];
           maxi=Math.max(res,maxi);
        }
        return maxi;
        
    }
}