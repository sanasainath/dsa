class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer>s=new Stack<>();
        for(char i:num.toCharArray())
        {
          int x = Character.getNumericValue(i);
           
            while(!s.isEmpty()&&s.peek()>x&&k>0)
        {
            
              s.pop();
              k--;
            
             
        }
       
       
            if(x==0&&s.isEmpty())
            {
                continue;
            }
            else
            {
        s.push(x);
            }
        
        }
                while (k > 0 && !s.isEmpty()) {
            s.pop();
            k--;
        }
        

        StringBuilder str = new StringBuilder();
             
        while (!s.isEmpty()) {
            int digit = s.pop();
            str.append(digit);
        }
        
       String result = str.length() == 0 ? "0" : str.reverse().toString();
        return result;

        
    }
}