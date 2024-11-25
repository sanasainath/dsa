class Pair{
    String st;
    int pos;
    Pair(String st,int pos)
    {
        this.st=st;
        this.pos=pos;
    }
}
class Solution {
    public int slidingPuzzle(int[][] board) {
        String target="123450";
      HashSet<String>set=new HashSet<>();
        Queue<Pair>q=new LinkedList<>();
        StringBuilder st=new StringBuilder();
        int positionzero=0;
        int xx=0;
         for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==0)
                {
                   positionzero=xx;
                 
                }
                xx++;
                st.append(board[i][j]);
            }
        }
        q.offer(new Pair(st.toString(),positionzero));
        set.add(st.toString());
        int level=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Pair pair=q.poll();
                String ss=pair.st;
                int position=pair.pos;
                if(ss.equals(target))
                {
                    return level;
                }
                

       
               if(position%3!=0)
               {
                 char[] charArray = ss.toCharArray();
                int index1=position;
                int index2=position-1;
                 char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;

        // Convert back to string
             String swappedString = new String(charArray);
            
             if(!set.contains(swappedString))
             {
                     set.add(swappedString);
                      q.offer(new Pair(swappedString,position-1));
             }
          
               }
            //    if(position!=2&&position!=5)
            if(position%3!=2)
               {
                 char[] charArray = ss.toCharArray();
                   int index1=position;
                int index2=position+1;
                 char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;

        // Convert back to string
             String swappedString = new String(charArray);
           if(!set.contains(swappedString))
             {
                     set.add(swappedString);
                      q.offer(new Pair(swappedString,position+1));
             }
               }

               if(position-3>=0)
               {
                 char[] charArray = ss.toCharArray();
                int index1=position;
                int index2=position-3;
                 char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;

        // Convert back to string
             String swappedString = new String(charArray);
           if(!set.contains(swappedString))
             {
                     set.add(swappedString);
                      q.offer(new Pair(swappedString,position-3));
             }
               }
               if(position+3<6)
               {
                 char[] charArray = ss.toCharArray();
                int index1=position;
                int index2=position+3;
                 char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;

        // Convert back to string
             String swappedString = new String(charArray);
              if(!set.contains(swappedString))
             {
                     set.add(swappedString);
                      q.offer(new Pair(swappedString,position+3));
             }
               }

        
       


            }
            level++;
        }
        return -1;
    

       

        
    }
}