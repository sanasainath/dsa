class Solution {
    public int maximumSwap(int num) {
       List<Integer>li=new ArrayList<>();
       while(num>0)
       {
        li.add(num%10);
        num=num/10;
       }
       Collections.reverse(li);
       boolean check=false;
       for(int i=0;i<li.size();i++)
       {
        int maxi=li.get(i);
        int index=i;
        for(int j=i+1;j<li.size();j++)
        {
            if(li.get(i)<li.get(j))
            {
            if(maxi<=li.get(j))
            {
                maxi=li.get(j);
                index=j;
            }
             check=true;
                
             
            }
        }
        if(check)
        {
            int xx=li.get(i);
            li.set(i,li.get(index));
            li.set(index,xx);
            break;
        }
       }
       StringBuilder st=new StringBuilder();
       for(Integer ii:li)
       {
        st.append(ii);
       }

     return Integer.parseInt(st.toString());
        
    }
}