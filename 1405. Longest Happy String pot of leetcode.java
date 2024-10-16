class Pair{
    int x;
    char y;
    Pair(int x,char y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder st=new StringBuilder();
        List<Pair>li=new ArrayList<>();
        li.add(new Pair(a,'a'));
        li.add(new Pair(b,'b'));
        li.add(new Pair(c,'c'));
       

        
           while(true){
           
          
             Collections.sort(li,(p,q)->Integer.compare(q.x,p.x));

             boolean check=false;
                for(int i=0;i<li.size();i++)
                {
                      Pair pp=li.get(i);
               if(st.length()>=2&&st.charAt(st.length()-1)==pp.y&&st.charAt(st.length()-2)==pp.y)
               {
                continue;
               }
              
              if(pp.x>0)
              {
                st.append(pp.y);
                pp.x--;
                 check=true;
                break;
              }
            
                }
                if(!check)//no characters present...
                {
                    break;
                }
                    li.removeIf(pair -> pair.x == 0);
                 
           }
           return st.toString();

            
            
        
        
    }
}