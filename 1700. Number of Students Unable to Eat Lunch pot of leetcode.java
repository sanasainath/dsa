class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
      Queue<Integer>li=new LinkedList<>();
      Stack<Integer>st=new Stack<>();
      for(int j=sandwiches.length-1;j>=0;j--)
      {
        st.push(sandwiches[j]);
        
      }
      for(int i=0;i<students.length;i++)
      {
        li.offer(students[i]);
      }
      int count=0;
      while(!li.isEmpty())
      {
         int x=li.poll();
       
       
        if(st.peek()==x)
        {
            count=0;
            st.pop();
        }
        
        else
        {
            count++;
            li.offer(x);
             if(li.size()==count)
        {
            return li.size();
        }
        }
        

      }
      return 0;
        
    }
}