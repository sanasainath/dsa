class Pair{
    int x;
    int y;
    Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
      int nposition=positions.length;
      int nhealth=healths.length;
      List<Integer>li=new ArrayList<>();
    Pair []pair=new Pair[nposition];
      for(int i=0;i<nposition;i++)
      {
        pair[i]=new Pair(positions[i],i);

      }
     Arrays.sort(pair,(p1,p2)->Integer.compare(p1.x,p2.x));
     Stack<Integer>st=new Stack<>();
      for(int i=0;i<pair.length;i++)
      {
        if(!st.isEmpty()&&directions.charAt(st.peek())=='R'&&directions.charAt(pair[i].y)=='L')
        {
             if(healths[pair[i].y]==healths[st.peek()])
             {
                healths[pair[i].y]=0;
                healths[st.peek()]=0;
                st.pop();
             }
             else if(healths[pair[i].y]>healths[st.peek()])
             {
                boolean xx=true;
                healths[st.peek()]=0;
                st.pop();
                 healths[pair[i].y]-=1;
                while(!st.isEmpty())
                {
                    if(directions.charAt(st.peek())=='R'&&directions.charAt(pair[i].y)=='L')
                    {
                        if(healths[pair[i].y]==healths[st.peek()])
             {
                healths[pair[i].y]=0;
                healths[st.peek()]=0;
                st.pop();
                xx=false;
                break;
             }
                       else if(healths[pair[i].y]>healths[st.peek()])
                        {
                             healths[pair[i].y]-=1;
                        healths[st.peek()]=0;
                        st.pop();

                        }
                        else{
                            xx=false;
                          
                            healths[st.peek()]-=1;
                            healths[pair[i].y]=0;
                            break;
                        }
                        
                        
                    }
                    else
                    {
                        break;
                    }
                }
                 if(xx)
                 {
st.push(pair[i].y);
                 }
                

             }
             else
             {
                healths[pair[i].y]=0;
                healths[st.peek()]-=1;
             }

        }
       
        else
        {
            
st.push(pair[i].y);
            
               

        }
     

      }
      for(int i=0;i<positions.length;i++)
      {
        if(healths[i]!=0)
        {
            li.add(healths[i]);
        }
      }
      return li;
     


        
    }
}