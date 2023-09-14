class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>s=new Stack<>();

        for(int i:asteroids)
        {
          
          if(i>0)
          {
            s.push(i);
          }
          else
          {
            boolean survive=true;
            while(!s.isEmpty()&&s.peek()>0)
            {
              int x=s.pop();
              if(x==Math.abs(i))
              {
                survive=false;
                break;
                }
                else if(x>Math.abs(i))
                {
                  s.push(x);
                  survive=false;
                  break;
                }
                
            }
            if(survive)
            {
              s.push(i);
            }
          }
        }
        List<Integer>li=new ArrayList<>(s);
        int[]res=new int[li.size()];
        for(int i=0;i<res.length;i++)
        {
          res[i]=li.get(i);
        }
        return res;
    }
}