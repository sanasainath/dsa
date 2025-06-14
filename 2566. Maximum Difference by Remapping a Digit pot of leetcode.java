class Solution {
    public int minMaxDifference(int num) {
      List<Integer>li=new ArrayList<>();
      while(num>0)
      {
        li.add(num%10);
        num=num/10;
      }
      int val=-1;
      Collections.reverse(li);
      List<Integer>li1=new ArrayList<>();
      li1.addAll(li     );
      for(int i=0;i<li.size();i++)
      {
            if(val==-1&&li.get(i)!=9)
            {   val=li.get(i);
                li.set(i,9);
             
            }
            else if(val==li.get(i))
            {
              li.set(i,9);
            }
      }
      int val1=-1;
            for(int i=0;i<li1.size();i++)
      {
            if(val1==-1&&li1.get(i)!=0)
            { val1=li1.get(i);
                li1.set(i,0);
               
            }
            else if(val1==li1.get(i))
            {
              li1.set(i,0);
            }
      }
      int max=0;
      int min=0;
      for(int i:li)
      {
        max=max*10+i;
      }
      for(int i:li1)
      {
        min=min*10+i;
      }
      return max-min;


       
        
    }
}