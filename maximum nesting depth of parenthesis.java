class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=Integer.MIN_VALUE;
       
       if (!s.contains("(") && !s.contains(")"))
        {
            return 0;
        }
        for(int i=0;i<s.length();i++)
        {
              if(s.charAt(i)=='(')
              {
                  count++;
              }
              else if(s.charAt(i)==')')
              {
                  count--;
              }
              else
              {
                  continue;
              }
              max=Math.max(max,count);
        }
        return max;

    }
}